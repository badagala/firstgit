package com.gss.interfaceInjava8;

public interface B {

	public abstract void name();
	
	default void hi() {
		System.out.println("From B");
	}
}
