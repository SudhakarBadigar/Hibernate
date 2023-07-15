package com.criteria.CriteriaFunctions;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SelectAllcriteria {
	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure("resource/hibernate.cfg.xml");
		SessionFactory sf  = c.buildSessionFactory();
		Session os = sf.openSession();

     	Criteria cr =	os.createCriteria(Employee.class);
     	List<Employee> list =cr.list();
     	for(Employee e :list) {
     		//System.out.println(e);
     		System.out.println("......");
     		System.out.println(e.getName());
     	}
		
	}

}
