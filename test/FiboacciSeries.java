package com.gss.test;

import java.util.Scanner;

public class FiboacciSeries {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		scan.close();
		int t1=0;
		int t2=2;
		for(int i=0;i<=num;i++) {
			int y=t1+t2;
			System.out.println(y);
			t1=t2;
			t2=y;
		}
		
		
	}

}
