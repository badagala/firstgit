package com.gss.coding;

public class PrintingaLetterFromaWord {
	public static void main(String[] args) {
		String value="ambiGuity";
		
		for(int i=0; i<value.length();i++) {
			if(Character.isUpperCase(value.charAt(i))) {
				System.out.println(value.charAt(i));	
			}
		}
	}
	
}
