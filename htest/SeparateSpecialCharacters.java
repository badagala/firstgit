package com.gss.htest;

public class SeparateSpecialCharacters {
	
	public static void main(String[] args) {
		String value="hvsrhvshcvi@^#%#";
	//	char[] array=value.toCharArray();
		char letters = 0;
		char sepcialChars=0;
		 String result="";
		 String result1="";
		for(int i=0;i<value.length();i++) {
			if(Character.isLetterOrDigit(value.charAt(i))) {
				 letters=value.charAt(i);
				 result=result+letters;
				//System.out.println("letter or digit :"+value.charAt(i));
			}else {
				 sepcialChars=value.charAt(i);
				 result1=result1+sepcialChars;
				//System.out.println("Special characters :"+value.charAt(i));
			}	
		}
		System.out.println("Letters in a string are :"+result);
		System.out.println("Special chars in a string are :"+result1);
	}
}
