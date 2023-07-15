package com.IsARelationshipTabelePerClass.ORM;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientApp 
{
    public static void main( String[] args )
    {
    	Configuration c = new Configuration();
    	c.configure("resource/hibernate.cfg.xml");
    	SessionFactory sf = c.buildSessionFactory();
    	Session os = sf.openSession();
    	
    	Transaction tx = os.beginTransaction();
    	SoftwareReg sr = new SoftwareReg(1, "Rama", "ram@gmail.com",78000.02, "hibernate");
    	HardwareReg hw = new HardwareReg(2, "Krishna","kris@gmail.com", 88000.54, 8);
    	AdminReg ar = new AdminReg(3, "madhava", "madhava@ymail.com", 6600.00, "Bangalore");
    	
    	os.save(sr);
    	os.save(hw);
    	os.save(ar);
    	
    	tx.commit();

    	os.close();
    	sf.close();
    }
}
