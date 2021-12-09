package com.technoelevate.lamdaexp;

public class Pencil {

	public static void main(String[] args) {
		Pen p= (a,b)->(a+b); 
		System.out.println(p.add(55, 65));
		
		Pen p1=(a,b)->(a+b);
		System.out.println(p.add(22, 32));
	}

}
