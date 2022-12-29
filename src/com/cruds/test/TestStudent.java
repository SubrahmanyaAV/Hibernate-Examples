package com.cruds.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.cruds.entity.Address;
import com.cruds.entity.Course;
import com.cruds.entity.Phone;
import com.cruds.entity.Student;
import com.cruds.util.HibernateUtil;


public class TestStudent {
	
	public static void main(String[] args) {
		create();
		//get();
		//update();
		//demoCriteria();
	}
	private static void create()
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		
		Address addr = new Address("Tumkur");
		Student s1 = new Student("Raghu", addr);
		
		Phone p1 = new Phone("cops","100");
		Phone p2 = new Phone("Personal","8");
		Set<Phone> phones = new HashSet<>();
		phones.add(p1);
		phones.add(p2);
		s1.setPhones(phones);
		
		Course c1 = new Course("Hibernate");
		Course c2 = new Course("Spring");
		Set<Course> courses = new HashSet<>();
		courses.add(c1);
		courses.add(c2);
		s1.setCourse(courses);

		
		session.getTransaction().begin();
		session.save(s1);
		session.getTransaction().commit();
		
		session.close();
		HibernateUtil.shutdown();
	}
	
	
	private static void get()
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		
		Student s1 = (Student) session.get(Student.class, 1L);
		Hibernate.initialize(s1.getPhones());
		Hibernate.initialize(s1.getCourse());
		session.close();
		
		System.out.println(s1.getName());
		System.out.println(s1.getAddress());
		System.out.println(s1.getPhones());
		System.out.println(s1.getCourse());
		
		HibernateUtil.shutdown();
	}
     
	private static void update()
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		
		session.getTransaction().begin();
		Student s1 = (Student) session.load(Student.class, 1L);
		Hibernate.initialize(s1.getCourse());
		Course c3 = new Course("Java");
		s1.getCourse().add(c3);
		session.update(s1);
		session.getTransaction().commit();
		session.close();
		HibernateUtil.shutdown();
	}
	
	private static void demoCriteria()
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		
		Criteria cr = session.createCriteria(Student.class);
		cr.add(Restrictions.eq("name", "Yo"));
		
		List<Student> list = cr.list();
		
		for(Student s : list)
		{
			System.out.println(s);
		}
		
		session.close();
		HibernateUtil.shutdown();
	}
	
}
