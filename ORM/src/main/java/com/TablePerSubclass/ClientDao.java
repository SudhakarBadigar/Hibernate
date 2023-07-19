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
		Software soft1 = new Software(3, "morris", "moris@hmail.com", "spring");
		Hardware hard = new Hardware(2, "ponting", "point@ymail.com" , 5);
		Hardware hard1 = new Hardware(4, "ricky", "ricky@ymail.com" , 8);
		
		os.save(soft);
		os.save(hard);
		os.save(soft1);
		os.save(hard1);
			
		tx.commit();
		
		os.close();
		sf.close();
	}

}
