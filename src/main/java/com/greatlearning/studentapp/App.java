package com.greatlearning.studentapp;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	
	public static void main(String[] args) {
		
		// create Session factory Object
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
		SessionFactory sessionFactory = con.buildSessionFactory();

		// create StudentServiceImp object and pass it to session factory
		StudentService bs = new StudentServiceImp (sessionFactory);

		List<Student> students = bs.findAll();

		for (Student student : students) {
			System.out.println(student);
		}
	
	}
}
