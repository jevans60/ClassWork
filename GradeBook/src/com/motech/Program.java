package com.motech;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

public class Program
{

	public static void main(String[] args)
	{
				
		Student student = new Student();
		student.setName("Jeff");
		
		
		Address homeAddress = new Address();
		homeAddress.setAddressType(AddressType.HOME);
		homeAddress.setAddressLine1("101 Fifth St.");
		homeAddress.setAddressLine2("Suite 3a");
		homeAddress.setCity("St. Charles");
		homeAddress.setState("MO");
		homeAddress.setPostalCode("63303");
		
		Set addresses = new HashSet();
		addresses.add(homeAddress);
		
		student.setAddresses(addresses);
		
			
		Instructor instructor = new Instructor();
		instructor.setFirstName("John");
		instructor.setLastName("Smith");
		instructor.setInstructorName(instructor.getFirstName(), instructor.getLastName());
		
		Instructor instructor2 = new Instructor();
		instructor2.setFirstName("Ron");
		instructor2.setLastName("Regan");
		instructor2.setInstructorName(instructor.getFirstName(), instructor.getLastName());
		
		
		Course java = new Course();
		java.setCourseName("CSP 443 Advanced Java");
		java.setCreditHours(3.0f);
		java.setInstructor(instructor);
						
		Course cSharp = new Course();
		cSharp.setCourseName("CSP 233 Beginning C#");
		cSharp.setCreditHours(5.0f);
		java.setInstructor(instructor2);
		
		Course algebra = new Course();
		algebra.setCourseName("Beginners Algebra");
		algebra.setCreditHours(3.0f);
		algebra.setInstructor(instructor2);
		
		Course computer = new Course();
		computer.setCourseName("Intro to Computer Science");
		computer.setCreditHours(4.5f);
		computer.setInstructor(instructor);
		
		Rating rate = new Rating();
		rate.setCourse(java, 8.5d);
		
		Rating rate2 = new Rating();
		rate2.setCourse(cSharp, 9.0d);
		
		Rating rate3 = new Rating();
		rate3.setCourse(algebra, 7.0);
		
		Rating rate4 = new Rating();
		rate4.setCourse(computer, 8.0);
		
		Set courses = new HashSet();
		courses.add(java);
		courses.add(cSharp);
		courses.add(computer);
		courses.add(algebra);
		
		student.setCourses(courses);
		
		Set instructors = new HashSet();
		instructors.add(instructor);
		instructors.add(instructor2);
		
		instructor.setInstructors(instructors);
		
		Grade javaGrade = new Grade(student, java, 3.459f);
		Grade cSharpGrade = new Grade(student, cSharp, 3.975f);
		Grade algebraGrade = new Grade(student, algebra, 3.5f);
		Grade computerGrade = new Grade(student, computer, 3.0f);
		
		Session session = HibernateUtilities.getSessionFactory().openSession();		
		session.beginTransaction();	
			
		session.save(student);
		session.save(javaGrade);
		session.save(cSharpGrade);
		session.save(algebraGrade);
		session.save(computerGrade);

		session.getTransaction().commit();
		session.close();
		
		double result = GradebookBusinessLogic.calculateCumulativeGPA(student);

		System.out.println(student.getName() + " Cumulative Grade: " + result);
		System.out.println(instructor.getInstructorName() + ":" + rate4.getRate());
		System.out.println(instructor2.getInstructorName() + ";" + rate3.getRate());
	}

}
