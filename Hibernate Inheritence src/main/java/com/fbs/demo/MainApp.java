package com.fbs.demo;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[]args)
	{
		Session ses = new Configuration().configure().buildSessionFactory().openSession();
		
		org.hibernate.Transaction tr = ses.beginTransaction();
		Employee e1=new Employee(101,"Raj",45000);
		Employee e2=new Admin(102,"Aditya",36000,25000);
		Employee e3=new SalesManager(103,"Sohel",25000,12,210000);
		
		ses.persist(e1);
		ses.persist(e2);
		ses.persist(e3);
		
		
		
		
		
		
	}
}
