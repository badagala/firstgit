package com.gss.demotest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Apple {
	
	public static void main(String[] args) {
		
		ArrayList<String> arr=new ArrayList<String>();
		List<String> arr1=Arrays.asList("One","Two","Three");
		
		arr.add("four");
		arr.add("Five");
		
		List<String> result=new ArrayList<String>();
		result.addAll(arr);
		result.addAll(arr1);
		
		/*
		 * result.set(0, "one"); result.set(1, "Two"); result.set(2, "Three");
		 * result.set(3, "Four"); result.set(4, "Five");
		 */
		
		result.stream().collect(Collectors.toList());
		
		
		System.out.println(result.get(1));
		
	}

}
