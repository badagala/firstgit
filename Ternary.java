package com.technoelevate;

import java.util.Scanner;

public class Ternary{
	public static void main(String[] args) {
		int a,b,c,d;
		Scanner sa=new Scanner(System.in);
		System.out.println("enter all three numbers:");
		a=sa.nextInt();
		b=sa.nextInt();
		c=sa.nextInt();
		d=c>(a>b?a:b)?c:((a>b)?a:b);
		System.out.println("Largest Number:"+d);
		

	}

}
 