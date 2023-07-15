package com.dumping.HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchoneRow {
	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = c.buildSessionFactory();
		Session openSession = sessionFactory.openSession();
		
		String hql ="from NewStudentData where id =3";
		Query cq = openSession.createQuery(hql);
		Object o =cq.uniqueResult();
		NewStudentData st =(NewStudentData)o;
		//NewStudentData st= new NewStudentData();
		System.out.println(st.getId());
		System.out.println(st.getName());
		System.out.println(st.getEmail());
		
		
		
		sessionFactory.close();
		openSession.close();
	}

}
