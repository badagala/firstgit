package com.te;

public class App {
	public static void main(String[] args) {
		SuperHeros s1 = new SuperHeros("spiderman", "spider", "spiderweb", 1);
		SuperHeros s2 = new SuperHeros("superman", "superpower", "crypton", 2);
		SuperHeros s3 = new SuperHeros("loki", "thefting", "escaping", 3);
		SuperHeros s4 = new SuperHeros("lokesh","DNk","Keliking",4);
		GetCommunicationDAO.inserQuery(s1);
		GetCommunicationDAO.inserQuery(s2);
		GetCommunicationDAO.inserQuery(s3);
		GetCommunicationDAO.inserQuery(s4);
		// System.out.println("hi");

	}

}
