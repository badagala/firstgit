package com.gss.base;

public class GCDivisor {

	public static void main(String[] args) {

	int a=58,b=38;	
	while(b>0) {
	int temp=b;
	b=a%b;
	a=temp;
	}
   System.out.println(a);
	}

}
