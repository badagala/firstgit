 package com.gss.basics;

import java.util.Scanner;

public class AddTwoNumbers {
	
	public static void main(String args[]) {
		Scanner value=new Scanner(System.in);
	
		System.out.println("Please enter the first number :");
		int num1=value.nextInt();
		System.out.println("Please enter the Second number :");
        int num2=value.nextInt();
        value.close();
        int result= num1+num2;
        
        System.out.println("The Result of adding Two numbers is :"+ result);
       
		
	}

}
