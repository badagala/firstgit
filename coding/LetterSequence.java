package com.gss.coding;

public class LetterSequence {
	
	public static void main(String[] args) {
		String value="Hello";
		String value1="World";
		String result="";
		
		for(int i=0; i<5;i++) {
			result=result+value.charAt(i);
			result=result+value1.charAt(i);
		}
		System.out.println(result);
	}
}
