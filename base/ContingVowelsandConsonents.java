package com.gss.base;

public class ContingVowelsandConsonents {

	//Have to check
	public static void main(String[] args) {
		String input="ThisisanExample";
		String vowels="aeiou";
		int vowelCount=0;
		int consonentCount=0;
		StringBuffer n=new StringBuffer();
		for(int i=0;i<input.length();i++) {
			if(!(vowels.contains(String.valueOf(input.charAt(i))))) {//here we are checking like direct vowel is present skip or else append 
				n.append(input.charAt(i));	
				consonentCount++; 
				}
			else if(!(vowels.contains(String.valueOf(input.charAt(i-1))))) { // If the vowel is not present as the previous value then we can append the i value  
				n.append(input.charAt(i));
				vowelCount++; 
			}
		}
		System.out.println(vowelCount);
		System.out.println(consonentCount);
	}
}
