package com.gss.basics;

public class FindLargestNumber {
	
	public static void main(String[] args) {
		int num1=105,num2=155,num3=100;
		
		//Using terynary operator
		int result=(num1>num2) ? (num1>num3 ? num1:num2) : (num2>num3 ?num2 : num3);
		
		System.out.println("The largest amount three numbers is :"+result);

	}
}
