package com.gss.basics;

import java.util.Scanner;

public class AreaOfCircle {
	
	public static void main(String[] args) {
		
	 double radius;
	 
	 Scanner value=new Scanner(System.in);
	 System.out.println("Enter the radius Value :");
	radius= value.nextDouble();
	 System.out.println("The given value is :"+radius);
	 
	 double result=Math.PI*radius*radius;
	 System.out.println("The area of the given radius is :"+result);
	 
	}
	//Example program -> youtube channel

}
