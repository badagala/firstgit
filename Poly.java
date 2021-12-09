package com.technoelevate.polymorphism;

public class Poly{
	int x=10;
	int y=20;
	void sum(int x, int y)
	{
		int i= x+y;
		System.out.println("The sum of x and y is :"+i);
	}
void sum(int x,int y, int z) 
{
	int i = x+y+z;
	System.out.println("The sum x,y and z is :"+i);
}
	public static void main(String[] args) {
		Poly p = new Poly();
		p.sum(30, 50);
		p.sum(55, 65, 85);
		
	}

}
