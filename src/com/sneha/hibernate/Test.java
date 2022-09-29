package com.sneha.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// Step 1
		Configuration configuration = new Configuration();
		configuration.configure( "hibernate.cfg.xml");

		// Step 2
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Student student = new Student();
		student.setFirstName("Sneha");
		student.setLastName("Namaya");
		session.save(student);
		transaction.commit();
		session.clear();
		System.out.println("Record saved successfully");

	}

}
