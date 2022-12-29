package com.cruds.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cruds.entity.Address;
import com.cruds.entity.Course;
import com.cruds.entity.CredentialBean;
import com.cruds.entity.OrderBean;
import com.cruds.entity.Phone;
import com.cruds.entity.Student;
import com.cruds.util.HibernateUtil;

public class TestOrder {
	
	public static void main(String[] args) {
		create();
	}
	
	private static void create()
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		
		CredentialBean cb = new CredentialBean(1000L, "dummy", "C", 0);
		
		OrderBean ob = new OrderBean( 159.89D, "PENDING"
									,"SS Puram", "Tumkur","Karnataka","572102", "101");
		
		Set<OrderBean> orders = new HashSet<>();
		orders.add(ob);
		cb.setOrders(orders);
		
		session.getTransaction().begin();
		session.save(cb);
		session.getTransaction().commit();
		
		session.close();
		HibernateUtil.shutdown();
	}
	

}
