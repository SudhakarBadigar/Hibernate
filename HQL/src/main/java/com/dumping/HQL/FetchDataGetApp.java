package com.dumping.HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDataGetApp {
	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = c.buildSessionFactory();
		Session openSession = sessionFactory.openSession();
		
		NewStudentData newStudentData = openSession.get(NewStudentData.class, 5);
		System.out.println(newStudentData);
		sessionFactory.close();
		openSession.close();
		
	}

}
