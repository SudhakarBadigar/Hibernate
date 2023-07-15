package com.criteria.CriteriaFunctions;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateTableApp {
	public static void main(String[] args) {
		
			
	Configuration c = new Configuration();
	c.configure("resource/hibernate.cfg.xml");
	SessionFactory sf = c.buildSessionFactory();
	Session os = sf.openSession();
	
	Employee e1 = new Employee(1, "ganesha", 75000.00, "ganesha@gmail.com", "#17 4th street");
	Employee e2 = new Employee(2, "shiva", 88000.00, "shiva@ymail.com", "#11 4th street");
	Employee e3 = new Employee(3, "madhava", 44000.00, "madava@hmail.com", "#8 4th street");
	Employee e4 = new Employee(4, "keshava", 98000.00, "keshav@gmail.com", "#12 4th street");
	Employee e5 = new Employee(5, "karthika", 22000.00, "kar@gmail.com", "#4 4th street");

	Transaction tx = os.beginTransaction();
	os.save(e1);
	os.save(e2);
	os.save(e3);
	os.save(e4);
	os.save(e5);
	
	
	tx.commit();
	
	sf.close();
	os.close();
	
	
	
	}

}
