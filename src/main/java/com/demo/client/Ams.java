package com.demo.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Ams {
	public static void main(String[] args) {
		Account a1=new Account();
		a1.setAccountId(1230001);
		a1.setBranchName("xyz");
		a1.setCity("Mumbai");
		System.out.println("Hai Hello How are you");
		System.out.println("Welcome to chennai");
		Employee e1=new Employee();
		e1.seteId(100);
		e1.setEname("Rajesh");
		e1.setAccount(a1);
		a1.setEmployee(e1);
		
		
		
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml")
				.buildSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		session.save(a1);
		session.save(e1);
		session.getTransaction().commit();
		session.close();
		sf.close();
		
	}
}
