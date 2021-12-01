package com.technoelevate.cartlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Grocery {
	private String itemname;
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Grocery(String itemname, int price) {
		super();
		this.itemname = itemname;
		this.price = price;
	}
	private int price;
	static Scanner sc = new Scanner(System.in);
	
			
		static ArrayList<Grocery> List = new ArrayList<Grocery>();
		public static void add() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			for(int i=0; i<n; i++) {
				List.addAll(sc.next());
				
			}

			System.out.println("items added to list successfully");
			
			}
			
		public static void view() {
			System.out.println(List);
		
		}
		
		public static void removeitem() {
			
		}
		
		public static void remove() {
			
		}
		public static Iterator iterator() {
			return null;
		}
		
		
	}
	
	
	
