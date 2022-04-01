package com.techno.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.techno.dto.Doctors;
import com.techno.dto.Patients;

@Repository
public class DAOLayerImpl implements DaoLayer {
	
    @PersistenceUnit
	EntityManagerFactory factory ;

	public boolean signUpDoc(Doctors doc) {
		boolean flag = false;
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tr = manager.getTransaction();
		try {
			tr.begin();
			manager.persist(doc);
			flag = true;
			tr.commit();
		} catch (Exception e) {
			tr.rollback();
			e.printStackTrace();
		}
		manager.close();
		return flag;
	}

	public boolean signUpPat(Patients pat) {
		boolean flag = false;
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tr = manager.getTransaction();
		try {
			tr.begin();
			manager.persist(pat);
			flag = true;
			tr.commit();
		} catch (Exception e) {
			tr.rollback();
			e.printStackTrace();
		}
		manager.close();
		return flag;

	}

	public boolean loginForPat(int aadharNumber, String password) {
		boolean flag = false;
		EntityManager manager = factory.createEntityManager();
		Patients pat = manager.find(Patients.class, aadharNumber);
		System.out.println(pat);
		if (pat.getPassword().equals(password)) {
			flag = true;
		}
		return flag;
	}

	public boolean loginForDoc(int id, String password) {
		boolean flag = false;
		EntityManager manager = factory.createEntityManager();
		Doctors doc = manager.find(Doctors.class, id);

		if (password.equals(doc.getPassword())) {
			flag = true;
		}

		return flag;
	}

	public List<Doctors> getAllDoctors() {
		EntityManager manager = factory.createEntityManager();

		String jpql = "FROM Doctors";
		Query query = manager.createQuery(jpql);
		List results = (ArrayList<Doctors>) query.getResultList();

		return results;
	}

	public List<Patients> getAllPatients() {
		EntityManager manager = factory.createEntityManager();

		String jpql = "FROM Patients";
		Query query = manager.createQuery(jpql);
		List results = (ArrayList<Patients>) query.getResultList();

		return results;
	}

	public boolean updateDoc(Doctors emp) {
		boolean flag = false;
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Doctors myemp = manager.find(Doctors.class, emp.getId());
			if (emp.getFirstName() != null && emp.getFirstName() != "") {
				myemp.setFirstName(emp.getFirstName());
			}
			if (emp.getLastName() != null && emp.getLastName() != "") {
				myemp.setLastName(emp.getLastName());
			}
			if (emp.getContactNumber() != null && emp.getContactNumber() != "") {
				myemp.setContactNumber(emp.getContactNumber());
			}
			if (emp.getPassword() != null && emp.getPassword() != "") {
				myemp.setPassword(emp.getPassword());
			}
			transaction.commit();
			flag = true;

		} catch (Exception e) {
			transaction.rollback();
			manager.close();
			e.printStackTrace();
		}
		return flag;
	}

	public boolean updatePat(Patients emp) {
		boolean flag = false;
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Patients myemp = manager.find(Patients.class, emp.getAadharNumber());
			if (emp.getFirstName() != null && emp.getFirstName() != "") {
				myemp.setFirstName(emp.getFirstName());
			}
			if (emp.getLastName() != null && emp.getLastName() != "") {
				myemp.setLastName(emp.getLastName());
			}
			if (emp.getContactNumber() != null && emp.getContactNumber() != "") {
				myemp.setContactNumber(emp.getContactNumber());
			}
			if (emp.getPassword() != null && emp.getPassword() != "") {
				myemp.setPassword(emp.getPassword());
			}
			transaction.commit();
			flag = true;

		} catch (Exception e) {
			transaction.rollback();
			manager.close();
			e.printStackTrace();
		}
		return flag;
	}

}

