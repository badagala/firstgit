package com.techno.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.spi.SessionFactoryBuilderFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		Laptop lap = new Laptop();
		lap.setId(1);
		lap.setName("dell");
		
		Student student = new Student();
		student.setId(1);
		student.setName("ravi");
		student.setPlace("hyderabad");
		student.setLap(lap);
		
		Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
	//	SessionFactoryBuilderFactory session = config.buildSessionFactory();
		
		
//		
//				
//		session.save(student);
//		session.save(student);
//
//		
//		

	}

}
