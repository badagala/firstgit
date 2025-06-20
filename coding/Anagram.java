package com.gss.coding;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String value1="abcd";
		String value2="dcba";
		char[] result=value1.toCharArray();
		char[] result1=value2.toCharArray();
		
		Arrays.sort(result1);
		Arrays.sort(result);
	  System.out.println(Arrays.equals(result, result1));
	}
}
