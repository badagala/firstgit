package com.gss.demotest;

import java.util.Arrays;
import java.util.List;

public class Pineapple {
	
	public static void main(String[] args) {
		
		List<Integer> value=Arrays.asList(2,3,4,5,6,7,8,9,10);
		
		value.stream().filter(result -> result%2 ==0 ).forEach(System.out::println);
		
	}

}
