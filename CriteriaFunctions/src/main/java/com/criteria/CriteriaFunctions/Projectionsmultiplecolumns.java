package com.criteria.CriteriaFunctions;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class Projectionsmultiplecolumns {

	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure("resource/hibernate.cfg.xml");
		SessionFactory sf = c.buildSessionFactory();
		Session os = sf.openSession();
		
		
		Criteria cr = os.createCriteria(Employee.class);
		Projection p1 = Projections.property("name");
		Projection p2 = Projections.property("salary");
		ProjectionList p = Projections.projectionList();
		
		p.add(p1);
		p.add(p2);
		cr.setProjection(p);
	    List<Object[]> list = cr.list();
	    for(Object[] l:list) {
	    	System.out.println("Name: "+l[0]);
	    	System.out.println("Salary: "+l[1]);
	    	System.out.println("............");
	    }
	}
}
