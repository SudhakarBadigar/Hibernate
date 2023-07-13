package com.dumping.HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OldDataApp 
{
    public static void main( String[] args )
    {
    	Configuration c = new Configuration();
    	c.configure("hibernate.cfg.xml");
    	SessionFactory bsf = c.buildSessionFactory();
    	Session os = bsf.openSession();
    	Transaction begintransaction = os.beginTransaction();
    	
    	
    	OldStudentData osd1 = new OldStudentData(1, "ganapa", "ganapa@gmail.com", "#17,4thmain bng");
    	OldStudentData osd2 = new OldStudentData(2, "shiva", "shiva@gmail.com", "#12,4thmain kailasa");
    	OldStudentData osd3 = new OldStudentData(3, "vishnu", "vishnu@gmail.com", "#8,8thmain tirpathi");
    	OldStudentData osd4 = new OldStudentData(4, "prayog", "prayog@gmail.com", "#11, upstreet NY");
    	
    	os.save(osd1);
    	os.save(osd2);
    	os.save(osd3);
    	os.save(osd4);
    	
    	begintransaction.commit();
    	os.close();
    	bsf.close();
    }
}
