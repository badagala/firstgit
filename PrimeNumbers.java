package com.technoelevate;

import java.util.Scanner;

public class PrimeNumbers {

public static void main(String[] args)
{
		int num, i=2, count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		num=sc.nextInt();
		while(i<num)
		{
			if(num%i == 0)
			{
				count++;
				break;
			}
		}
		if(count==0)
			System.out.println("\n It is a prime number.");
		else
			System.out.println("\n It is not a prime number.");
			}
			
		
	}
