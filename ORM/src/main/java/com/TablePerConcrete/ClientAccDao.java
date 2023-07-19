package com.TablePerConcrete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientAccDao {
	
	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sf = c.buildSessionFactory();
		Session os =  sf.openSession();
		
		Transaction tx = os.beginTransaction();
		AccentureEmployee ac1 = new AccentureEmployee( 1,"Rama","ram@gmail.com", 200000);
		AccentureEmployee ac2 = new AccentureEmployee( 2,"varaha","varaha@gmail.com", 400000);
		AccentureEmployee ac3 = new AccentureEmployee( 3,"parashu","pr@gmail.com", 300000);
		AccentureEmployee ac4 = new AccentureEmployee( 4,"krishna","kr@gmail.com", 500000);
		
		Sofware s1 = new Sofware(5, "shiva", "sh@mail.com",10000 , 8);
		Sofware s2 = new Sofware(6, "bhairava", "bairava@mail.com",20000 , 7);
		Sofware s3 = new Sofware(7, "manjunataha", "mj@mail.com",30000 , 10);

		Harware h1 = new Harware(8, "subramanya", "sub@gmail.com",2200, "jira");
		Harware h2 = new Harware(9, "kumaraswamy", "kumar@gmail.com",2400, "Aws");
		Harware h3 = new Harware(10, "palani", "pal@gmail.com",2500, "Devops");
		
		os.save(ac1);
		os.save(ac2);
		os.save(ac3);
		os.save(ac4);
		
		os.save(s1);
		os.save(s2);
		os.save(s3);
		
		os.save(h1);
		os.save(h2);
		os.save(h3);
		
		tx.commit();
		
		sf.close();
		os.close();
	}

}
