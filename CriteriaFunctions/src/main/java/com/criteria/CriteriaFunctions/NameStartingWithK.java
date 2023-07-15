package com.criteria.CriteriaFunctions;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class NameStartingWithK {
	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure("resource/hibernate.cfg.xml");
		SessionFactory sf = c.buildSessionFactory();
		Session os = sf.openSession();
		
		Criteria cr = os.createCriteria(Employee.class);
		Criterion ct = Restrictions.like("name","keshava");
		cr.add(ct);
		List<Employee> list = cr.list();
		for(Employee l :list) {
			System.out.println(l.getSalary()+"--->" + l.getMail());
		}
	
		
		
	}

}
