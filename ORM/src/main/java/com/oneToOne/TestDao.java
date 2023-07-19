package com.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDao {
	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sf= c.buildSessionFactory();
		Session os= sf.openSession();
		
		Transaction tx = os.beginTransaction();
		Person person = new Person();
		person.setName("Ramakrishna");
		
		Address address = new Address();
		address.setCity("Ayodya");
		address.setStreet("#1,Hanmuman Mandir");
		
		os.save(person);
		tx.commit();

		sf.close();
		os.close();
	}

}
