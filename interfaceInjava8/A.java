package com.gss.interfaceInjava8;

public interface A {
	
	public abstract void name();
	
	default void hi() {
		System.out.println("From A");
	}

}
