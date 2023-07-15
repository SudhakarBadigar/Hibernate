package com.dumping.HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class DeleteDataApp {
	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = c.buildSessionFactory();
		Session os = sessionFactory.openSession();
		
		String hql ="delete OldStudentData where id = 5";
		Transaction tx = os.beginTransaction();
		Query cq = os.createQuery(hql);
		int i = cq.executeUpdate();
		tx.commit();
		
		System.out.println("deleted row "+i);
		System.out.println("..................");
	}

}
