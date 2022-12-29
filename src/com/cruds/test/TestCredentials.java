package com.cruds.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cruds.entity.Credentials;
import com.cruds.entity.Profile;
import com.cruds.entity.UserCredentials;
import com.cruds.entity.UserProfile;
import com.cruds.util.HibernateUtil;

public class TestCredentials {

	public static void main(String[] args) {
		
		//create();
		createProfile();
	}

	private static void create()
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();

		Profile p = new Profile("Subbu", "AV");
		Credentials c = new Credentials("101", "dummy", p);
		
		session.getTransaction().begin();
		session.save(c);
		session.getTransaction().commit();
		
		session.close();
		HibernateUtil.shutdown();

	}
	
	private static void createProfile()
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();

		UserProfile u = new UserProfile("Subrahmanya", "AV", "Male", "1st Cross", "SS puram", "Tumkur", "Karnataka","572102", "7894561230", "s@gmail.com");
		UserCredentials user = new UserCredentials("101", "dummy",1, u);
		
		session.getTransaction().begin();
		session.save(user);
		session.getTransaction().commit();
		
		session.close();
		HibernateUtil.shutdown();

	}

}
