package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateDemo {

	public static void main(String[] args) {
		
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
	Transaction tr=	s.beginTransaction();
	
	DataInfo data =new DataInfo();
	data.setName("Shreyas ");
	data.setCity("Pune");
		
		
		s.save(data);
		tr.commit();
		s.close();
		
		System.out.println("Transaction Successful");
		
		}
}
