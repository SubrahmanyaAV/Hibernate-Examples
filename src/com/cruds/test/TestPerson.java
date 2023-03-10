package com.cruds.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cruds.entity.Employee;
import com.cruds.entity.Owner;
import com.cruds.entity.Person;
import com.cruds.util.HibernateUtil;

public class TestPerson {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		
		session.getTransaction().begin();
		
		/*Person p = new Person("Subbu", "Mowdhgalya");
		session.save(p);
		
		Employee e = new Employee("Anil", "Kumar", new Date(), "PROD");
		session.save(e);*/
		
		Owner o = new Owner("AVN","Murthy",10l,55l);
		session.save(o);
		session.getTransaction().commit();
		session.close();
		HibernateUtil.shutdown();
		
	}

}
