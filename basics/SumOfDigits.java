package com.gss.basics;

public class SumOfDigits {
	
	public static void main(String[] args) {
		
		int sum=0,number=143;
		
		while( number > 0) {
			/*
			 * remainder = number % 10; sum = sum + remainder; number = number / 10;
			 */
			//easy way
			sum=sum+(number%10); // sum +=number % 10;
			number /=10;
			
		}
		System.out.printf("The resultant value is %d",sum);
		
	}

}
