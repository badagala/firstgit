package com.gss.base;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String  input="abcd";
		String input1="bcda";
		
		char[] arr=input.toCharArray();
		char[] arr1=input1.toCharArray();

		Arrays.sort(arr);
		Arrays.sort(arr1);
		System.out.println(Arrays.equals(arr, arr1));
	}

}
