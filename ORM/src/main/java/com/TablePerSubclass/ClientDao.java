package com.TablePerSubclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDao {
	public static void main(String[] args) {
		
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sf = c.buildSessionFactory();
		Session os = sf.openSession();
		
		Transaction tx = os.beginTransaction();
		
		Software soft = new Software(1, "chris", "chril@hmail.com", "springBoot");
		Hardware hard = new Hardware(2, "ponting", "point@ymail.com" , 5);
		
		os.save(soft);
		os.save(hard);
			
		tx.commit();
		
		os.close();
		sf.close();
	}

}
