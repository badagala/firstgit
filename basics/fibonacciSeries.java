package com.gss.basics;

import java.util.Scanner;

public class fibonacciSeries {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value:");
		int number=input.nextInt();
		input.close();
		int t1=0;
		int t2=1;
		int nextValue;
		
		for(int count=1; count<=number; count++) {
			System.out.printf("%d ",t1);
			nextValue=t1+t2;
			
			t1=t2;
			t2=nextValue;
			
		}	
		
	}

}
