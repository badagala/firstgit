package com.gss.interfaceInjava8;

public interface Cat {

	void eat();
	default void sound() {
		System.out.println("Cat");
	}
}
