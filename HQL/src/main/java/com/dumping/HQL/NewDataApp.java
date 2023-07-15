package com.dumping.HQL;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class NewDataApp {
	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sf = c.buildSessionFactory();
		Session session = sf.openSession();
		String hql = "INSERT INTO NewStudentData (id, name, email, address) SELECT o.id, o.name, o.email, o.address FROM OldStudentData o";

		Transaction tx = session.beginTransaction();
		Query q = session.createQuery(hql);
		int i = q.executeUpdate();
		System.out.println("no of rows dumped from old to new table"+i);
		tx.commit();

//		System.out.println(".................");
//		NewStudentData t = session.get(NewStudentData.class, 5);
//		System.out.println(t);
		
		session.close();
		sf.close();
		
	}

}
