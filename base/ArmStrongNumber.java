package com.gss.base;

public class ArmStrongNumber {

	public static void main(String[] args) {
	
		int sum=0,num=153,temp=num;
		while(temp!=0) {
			int digit=temp%10;
			sum +=Math.pow(digit, 3);//0=0+3^3
			temp /=10;//temp=temp/10
		}

		System.out.println(num==sum);
	}

}
