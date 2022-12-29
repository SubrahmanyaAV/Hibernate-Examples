package com.cruds.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cruds.entity.StudentDemo;
import com.cruds.util.HibernateUtil;


public class TestStudentDemo {

	public static void main(String[] args) {

		Create();
	}

	public static void Create()
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		StudentDemo s = new StudentDemo(101,"subbu");
		session.save(s);
		tx.commit();
		session.close();
		HibernateUtil.shutdown();
	}
}



