package com.gss.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
	
	public static void main(String[] args) {
	
	List<List<String>> input=Arrays.asList(Arrays.asList("apple","bananna","Orange","watermelon"), Arrays.asList("Carrot","potato","Onion","Cauliflower"));
			
		List<String> result=input.stream().flatMap(list ->list.stream()).collect(Collectors.toList());
		
		System.out.println(result);
	}

}

