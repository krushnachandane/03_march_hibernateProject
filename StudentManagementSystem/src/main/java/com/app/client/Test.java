package com.app.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.app.config.HibernateUtil;
import com.app.model.Student;

public class Test {
	
	public static void main(String[] args) {
		
	 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		
		while(true)
		{
			int ch=1;
		
			switch(ch)
			{
			case 1: Student s1 = new Student();
			        System.out.println("Enter Student ID");
							s1.setId(sc.nextInt());
					System.out.println("Enter Student Name");
							s1.setName(sc.next()+sc.nextLine());
					System.out.println("Enter Student ID");
							s1.setMobno(sc.nextLong());
							
					Session openSession = sessionFactory.openSession();
							openSession.persist(s1);
							openSession.beginTransaction().commit();
					
					break;
					
			case 2:
						Session openSession2 = sessionFactory.openSession();
						System.out.println("Enter Student Id");
						Integer id = sc.nextInt();
						Student stu = openSession2.get(Student.class,id);
							System.out.println("Student ID   :-\t\t"+stu.getId());
							System.out.println("Student Name :-\t"+stu.getName());
							System.out.println("Student Mobno:-\t"+stu.getMobno());
					break;
			case 3:
					break;
			case 4:
					break;
			default:
					break;
			}
		}
	}

}
