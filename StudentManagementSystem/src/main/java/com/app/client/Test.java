package com.app.client;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.app.config.HibernateUtil;
import com.app.model.Student;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		while(true)
		{
			
			
			System.out.println("-------------MENU------------- \n\n1.Create Student\n2.Retrieve Student\n3.Update Student\n4.Delete Student");
			
			System.out.println("Enter a number according to your task : - ");
			
			int ch=sc.nextInt();
		
			switch(ch)
			{
			case 1:
					break;
			case 2:
					break;
			case 3:
				Session session3 = sessionFactory.openSession();
				System.out.println("Enter the student id to update");
				
				int id3 = sc.nextInt();
				
				Student s = session3.get(Student.class, id3);
				
				System.out.println("Enter the Student Name = ");
				s.setName(sc.next()+sc.nextLine());
				System.out.println("Enter the Student Mobile Number");
				s.setMobno(sc.nextLong());
				
				session3.merge(s);
				session3.beginTransaction().commit();
					break;
					
			case 4:
				Session session4 = sessionFactory.openSession();
				
				System.out.println("Enter the student id to delete");
				
				int id4 = sc.nextInt();
				
				Student s4 = session4.get(Student.class, id4); 
				
				session4.remove(s4);
				
				session4.beginTransaction().commit();
					break;
			default:
					break;
			}
		}
	}

}
