package com.techno.customexception;

public class InvalidCredentials extends Exception {
	
	public InvalidCredentials() {
		super();
	}

	@Override
	public String toString() {
		return "InvalidCredentials please check the details you enetered";
	}

}


