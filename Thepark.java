package com.technoelevate;

import java.util.Scanner;

public class Thepark {

	public static void main(String[] args) {
		int x,y,t;
		 Scanner sa = new Scanner(System.in);
			System.out.println("the value of X and Y");
			x=sa.nextInt();
			y=sa.nextInt();
		System.out.println("before swapping numbers:"+x+""+y);
		t=x;
		x=y;
		y=t;
		System.out.println();

	}

}
