package com.gss.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertionUsingStreams {
	
	public static void main(String[] args) {
		List<String> value=Arrays.asList("1","2","4","6","9","14","17","20","16","12","19","21","25");
		
		List<Integer> result=value.stream().map(Integer :: valueOf).filter(a->a%2==0).collect(Collectors.toList());
		System.out.println(result);
		
	}

}
