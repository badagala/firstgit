package com.gss.base;

import java.util.Arrays;

public class A {
	
	public static void main(String[] args) {
		
		String s1 = "abcd";
		String s2 = "dabc";
		char[] charArray = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();
		Arrays.sort(charArray);
		Arrays.sort(charArray2);

		if (charArray.equals(charArray2)) {
			System.out.println("valid");
		} else
			System.out.println("not valid");
	}
	
}

