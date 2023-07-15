package com.criteria.CriteriaFunctions;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class GreaterThan {
	public static void main(String[] args) {
		Configuration c  = new Configuration();
		c.configure("resource/hibernate.cfg.xml");
		SessionFactory sf  = c.buildSessionFactory();
		Session os = sf.openSession();
		
		Criteria cr = os.createCriteria(Employee.class);
		Criterion ct  = Restrictions.gt("salary", 50000.00);
		
		cr.add(ct);
		//Employee e = (Employee)cr.uniqueResult();
		//System.out.println(e.getName());
		List<Employee> list = cr.list();
		
		
		for(Employee e: list) {
			System.out.println("sal greater than 50000:"+e.getName());
		}
	}

}
