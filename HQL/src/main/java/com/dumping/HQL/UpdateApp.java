package com.dumping.HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class UpdateApp {
	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = c.buildSessionFactory();
		Session openSession = sessionFactory.openSession();
		String hql="update NewStudentData set name = 'subramanya',email = 'subramanya@gmail.com', address = '#1street,kukke' where id = 5";
		
		Transaction tx = openSession.beginTransaction();
		
		Query query= openSession.createQuery(hql);
		int executeUpdate = query.executeUpdate();
		tx.commit();
		System.out.println("updated row"+executeUpdate);		
		
		openSession.close();
		sessionFactory.close();
	}

}
