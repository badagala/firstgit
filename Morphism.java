package com.technoelevate.polymorphism;

public class Morphism {
	void run(int i, int j,int k) {
	int d = i+j+k;
	System.out.println("The sum of the three is:"+d);
	}
	void sit(int i, int j, int k, int l) {
		int d = i+j+k+l;
		System.out.println("The sum of the four is:"+d);
	}
//	void eat(int i, int j, int k) {
//		int d = i+j+k;
//		System.out.println("The sum of the four is:"+d);
//	}
//	

	public static void main(String[] args) {
	Morphism m = new Morphism();
	m.run(90, 59, 99);
	m.sit(22, 11, 55, 66);
	m.run(10, 20, 50);
	}

}
