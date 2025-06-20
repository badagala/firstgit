package com.gss.demotest;

public class PrintCapitalLetter {

	public static void main(String[] args) {
		String name="loKesh";
		char[] c=name.toCharArray();
		for (char d : c) {
			if(Character.isUpperCase(d)) {
				System.out.println(d);
				break;
			}
				
		}
		
	}
}
