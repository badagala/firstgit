package com.gss.base;

public class Palindrome {
    //Same code for reverse a Number
	public static void main(String[] args) {
		int value=5445,temp,sum=0,r;
		temp=value; // temp value for to compare the number with the output so that will know given number is palindrome or not 
		while(value>0) {
		r=value%10; //will get the remaider 
		sum=sum*10+r; //adding remainder into a variable and so on iterating
		value=value/10; 
		}
		if(temp==sum) {
			System.out.println("It is Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}

	}

}
