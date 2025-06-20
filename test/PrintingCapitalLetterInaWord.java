package com.gss.test;

public class PrintingCapitalLetterInaWord {

	public static void main(String[] args) {
		String name="goKarna";
		
		for(char y:name.toCharArray()) {
			 if(Character.isUpperCase(y)) {
				 System.out.println(y);
				 break;
			 }
			
		}
		
		}
	}
