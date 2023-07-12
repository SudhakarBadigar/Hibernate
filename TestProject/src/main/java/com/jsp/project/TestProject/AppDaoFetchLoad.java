package com.jsp.project.TestProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AppDaoFetchLoad {

	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory bsf = c.buildSessionFactory();
		Session os = bsf.openSession();
		
		Employee l1 = os.load(Employee.class, 2);
//		System.out.println(l1); lazy initialization if we dont provie this
		System.out.println(l1);
		
		Employee l2 = os.load(Employee.class, 10);
		System.out.println(l2);
		os.close();
		bsf.close();
	}
}
