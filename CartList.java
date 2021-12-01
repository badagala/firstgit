package com.technoelevate.cartlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CartList {

	public static void main(String[] args) {
		ArrayList<Grocery> Gr= new ArrayList<Grocery>();
		
		Grocery g  = new Grocery ("biscuit",30);
		Grocery g1 = new Grocery ("lays",20);
		Grocery g2 = new Grocery ("Icecream",50);
		Grocery g3 = new Grocery ("fruits",100);
		Grocery g4 = new Grocery ("eggs",200);
		Grocery g5 = new Grocery ("Chocolates",200);
		Grocery g6 = new Grocery ("vegetables",70);
		Grocery g7 = new Grocery ("Drinks",30);
		
		Gr.add(g);
		Gr.add(g1);
		Gr.add(g2);
		Gr.add(g3);
		Gr.add(g4);
		Gr.add(g5);
		Gr.add(g6);
		Gr.add(g7);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("choose one of the number to get into it ");
		System.out.println("choose 1 for add the items");
		System.out.println("choose 2 for view the items");
		System.out.println("choose 3 for remove the items");
		System.out.println("choose 4 for search the items");
}
}
		
		
		
	
		
		
		
		
		
		
		

