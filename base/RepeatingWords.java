package com.gss.base;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatingWords {
	
	public static void main(String[] args) {
		
		List<String> input=Arrays.asList("abc","defg","hijklm","nopqrst","uvwxyz","nopqrst","hijklm","abc","defg");
		Map<String, Long> result=input.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(result);
		

		
	}

}
