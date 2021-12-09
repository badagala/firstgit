package com.technoelevate.lamdaexp;

public class LambdaExp {

	public static void main(String[] args) {
	double d = 20;
	
	Current c = ()->{ System.out.println("cutting:"+ d);};
	
	c.cut();
	}

}
