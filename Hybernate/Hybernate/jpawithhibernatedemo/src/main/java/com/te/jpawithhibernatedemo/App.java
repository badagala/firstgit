package com.te.jpawithhibernatedemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {

		Room ro = new Room("Ravi",5);
		Hostel hos = new Hostel("Aneethhostel",50,"hyderabad",ro);
		
		EntityManagerFactory manager = Persistence.createEntityManagerFactory("Aneeth-hostel");
		EntityManager man = manager.createEntityManager();
		man.getTransaction().begin();
		man.persist(ro);
		man.persist(hos);
		man.getTransaction().commit();
	}
}



