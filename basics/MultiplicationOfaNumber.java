package com.gss.basics;

import java.util.Scanner;

public class MultiplicationOfaNumber {
	
	public static void main(String[] args) {
		
		int number,multiply;
		
		Scanner value=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=value.nextInt();
		
		System.out.println("Multiplication of a number is :"+num);
		
		for(multiply=1; multiply <=10; multiply++) {
			
			System.out.printf("%d * %d= %d\n", num,multiply,(num*multiply));
		}
		
	}

}
