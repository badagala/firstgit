package com.techno.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		Showroom room = new Showroom();
		room.setName("Ravi");
		room.setId(1);
		room.setArea("Vizag");
		
		Bike bike = new Bike();
		bike.setName("Honda");
		bike.setId(1);
		bike.setModelno("125");
		
		Bike bike1 = new Bike();
		bike1.setName("Hero");
		bike1.setId(2);
		bike1.setModelno("110");
		
		Bike bike2 = new Bike();
		bike2.setName("Suzuki");
		bike2.setId(3);
		bike2.setModelno("120");
		
		Configuration config = new Configuration().addAnnotatedClass(Bike.class).addAnnotatedClass(Showroom.class);
		SessionFactory factory= config.buildSessionFactory();
		
		//SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session= factory.openSession();
		Transaction transact =session.beginTransaction();
		session.save(room);
		session.save(bike);
		session.save(bike1);
		transact.commit();
		session.close();
		
	}

}
