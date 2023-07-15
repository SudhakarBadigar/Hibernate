package com.criteria.CriteriaFunctions;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

public class ProjectionsAllName {
	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure("resource/hibernate.cfg.xml");
		SessionFactory sf =c.buildSessionFactory();
		Session os = sf.openSession();
		
		Criteria cr  = os.createCriteria(Employee.class);
		Projection p =  Projections.property("name");
		
		cr.setProjection(p);
		List<String> list = cr.list();
		for(Object o: list) {
			System.out.println(o);
		}
	}

}
