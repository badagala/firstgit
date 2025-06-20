package com.gss.base;

public class ReverseString {
	
	public static void main(String[] args) {
		String input="Reverse";
		String output="";
		for(int i=0;i<input.length();i++) {
			output=input.charAt(i)+output;
		}
		System.out.println(output);
	}
}
