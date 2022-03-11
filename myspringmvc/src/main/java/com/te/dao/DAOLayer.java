package com.te.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.springframework.stereotype.Repository;

import com.te.dtolayer.Users;

@Repository
public class DAOLayer {
	
	EntityManagerFactory manager = Persistence.createEntityManagerFactory("Aneeth-hostel");

	public boolean getUsersdetail(Users user) {
		boolean b = false;
		
		EntityManager man = manager.createEntityManager();
		man.getTransaction().begin();
		man.persist(user);
		man.getTransaction().commit();
		man.close();

		b = true;

		return b;
	}

	public Users getuser(String name) {
		
		EntityManager man = manager.createEntityManager();
		Users user = man.find(Users.class, name);
		man.close();

		return user;
	}

	public boolean updatetrainee(String name, String mobileno) {
		
		boolean flag = false;
		
		EntityManager man = manager.createEntityManager();
		EntityTransaction transaction = man.getTransaction();
		try {	
			Users use = man.find(Users.class, name);
			use.setMobileno(mobileno);
			man.merge(use);
			transaction.commit();
			return true;
		}catch(Exception e) {
			
			transaction.rollback();
			e.printStackTrace();
			man.close();
			return flag;
		}
	}
	public boolean deletetrainee(String name) {
		boolean flag = false;
		
		EntityManager man = manager.createEntityManager();
		EntityTransaction transaction = man.getTransaction();
		try {
			Users use = man.find(Users.class, name);
			transaction.begin();
			man.remove(use);
			transaction.commit();
			return true;
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
			man.close();
			return flag;
			
		}
		
	}

}
