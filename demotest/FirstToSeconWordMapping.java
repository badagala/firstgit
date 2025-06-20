package com.gss.demotest;

public class FirstToSeconWordMapping {
	public static void main(String[] args) {
		String str="Hello";
		String value="World";
		String result="";
		for(int i=0;i<5;i++) {
		result=	str.charAt(i)+result;
			result=value.charAt(i)+result;
		}
		//System.out.println(result);
		String resultant="";
		for(int i=0;i<result.length();i++) {
			resultant=result.charAt(i)+resultant;
		}
		System.out.println(resultant);
	}

}
