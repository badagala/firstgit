package com.gss.interfaceInjava8;

public class C implements A,B{
	
	@Override
	public void name() {
	
	}

	@Override
	public void hi() {
		// TODO Auto-generated method stub
		A.super.hi();
	}
	
	public static void main(String[] args) {
	C n=new C();
	n.hi();
	
	}

}
