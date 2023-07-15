package com.dumping.HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchSingleDataApp {

	public static void main(String[] args) {
		Configuration c =new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sFactory = c.buildSessionFactory();
		Session session = sFactory.openSession();
		String hql = "select name from NewStudentData where id = 5";
		///Transaction tx = session.beginTransaction();
		Query cq = session.createQuery(hql);
		String i = (String)cq.uniqueResult();
		//int i = cq.executeUpdate();
		//tx.commit();
		System.out.println("Name of this id is : " +i);

		sFactory.close();
		session.close();
		
		
		
	}
}
