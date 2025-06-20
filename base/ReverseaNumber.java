package com.gss.base;

public class ReverseaNumber {
	public static void main(String[] args) {
		
		int input=456;
		int remainder;
		int output = 0;
		while(input>0) {
			remainder=input%10;
			output=output*10+remainder;
			input=input/10;
		}
		System.out.println(output);
	}

}
