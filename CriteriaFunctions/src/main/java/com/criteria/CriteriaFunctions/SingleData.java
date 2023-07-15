package com.criteria.CriteriaFunctions;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class SingleData {

	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure("resource/hibernate.cfg.xml");
		SessionFactory sf = c.buildSessionFactory();
		Session os = sf.openSession();
		
		Criteria cr = os.createCriteria(Employee.class);
		Criterion ct = Restrictions.eq("id",3);
		cr.add(ct);
    	Employee e =(Employee)cr.uniqueResult();
    	System.out.println(e.getName());
    	System.out.println("..........");
    	System.out.println(e);
    		
		
		
	}
}
