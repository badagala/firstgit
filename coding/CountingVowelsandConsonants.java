package com.gss.coding;

public class CountingVowelsandConsonants {
	
	public static void main(String[] args) {
		String value="This is an example to test how many vowels and consonants in a sentence";
		value=value.toLowerCase();
		int countVowels=0;
		int countConsonants=0;
		for(int i=0; i<value.length();i++) {
			if(value.charAt(i)=='a' || value.charAt(i)=='e' || value.charAt(i)=='i' 
					|| value.charAt(i)=='o'
					|| value.charAt(i)=='u') {
				countVowels++;
			}
			else {
				countConsonants++;
			}
		}
		System.out.println("Vowels Count"+countVowels);
		System.out.println("Consonants Count"+countConsonants);
	}

}
