package com.gss.coding;

public class CheckingPalindrome {
	
	public static boolean isPalindrome(String s) {
		s=s.toLowerCase();
		String str="";
		for(int i=0; i<s.length();i++) {
			str=s.charAt(i)+str;
		
		}
		System.out.println(str);
		return s.equals(str);
	}
	
	public static void main(String[] args) {
		
		String s="Civic";
		
		boolean result=isPalindrome(s);
		
		System.out.println(result);
	}
	 
}
