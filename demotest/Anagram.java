package com.gss.demotest;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		
		String a="Ravi";
		String b="ivaR";
		char[] d=a.toCharArray();
		char[] c=b.toCharArray();
		Arrays.sort(d);
		Arrays.sort(c);
	System.out.println(Arrays.equals(c, d));	
		/*
		 * public static boolean isAnagram(c,d){
		 * 
		 * return }
		 */
		
	}


}
