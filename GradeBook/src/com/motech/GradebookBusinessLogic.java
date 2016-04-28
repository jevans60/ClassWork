package com.motech;

import org.hibernate.Query;
import org.hibernate.Session;

public class GradebookBusinessLogic
{
	public static double calculateCumulativeGPA(Student student)
	{
		double attemptedHours = 0.0d;
		double qualityPoints = 0.0d;
		
		Session session = HibernateUtilities.getSessionFactory().openSession();
		session.beginTransaction();
		
		Query query = session.getNamedQuery("AttemptedHours").setString("name", student.getName());
			
		attemptedHours = (double) query.uniqueResult();
		
		Query qp = session.getNamedQuery("QualityPoints").setString("name", student.getName());
		
		qualityPoints = (double) qp.uniqueResult();
		
		session.getTransaction().commit();
		session.close();
		
		
		return qualityPoints / attemptedHours;
	}
}
