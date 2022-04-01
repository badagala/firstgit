package com.te.hibernate;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;




public class Showroom {

	public static void main(String[] args) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {

		Hyundai hyundai = new Hyundai();
		hyundai.setName("creata");
		hyundai.setModel("diesel");
		hyundai.setColor("black");

		Customers cust = new Customers();
		cust.setName("ravi");
		cust.setAddress("vizag");
		cust.setMobileno("9889654585");

		Configuration config = new Configuration().configure().addAnnotatedClass(Hyundai.class)
				.addAnnotatedClass(Customers.class);

		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transact = (Transaction) session.beginTransaction();
		session.save(hyundai);
		session.save(cust);
	   transact.commit();
	  
	  
	

	}

}
