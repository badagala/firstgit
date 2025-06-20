package com.gss.test;

import java.util.Scanner;

public class ReverseOfWord {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the details");
		
		String username=sc.nextLine();
		String reverse="";
		for(int i=username.length()-1;i>=0; i--) {
			
			reverse=reverse+username.charAt(i);
		}
		System.out.println(reverse);
	}

}
