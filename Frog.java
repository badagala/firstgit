package com.technoelevate.third;

public class Frog {
	public void come() {
		System.out.println("come here at 9 pm");
	}
	public void go() {
		System.out.println("go to park ");
	}
	public static void buy() {
		System.out.println("buy a car");
	}
	public static void clean() {
		System.out.println("clean that room");
	}
	
public static void main(String [] args) {
     Frog.buy();
     Frog.clean();
     Frog f= new Frog();
     f.go();
     f.come();
     
     

}
}
