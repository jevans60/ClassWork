package com.motech;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;

public class Program
{

	public static void main(String[] args)
	{
		Note note1 = new Note("a simple note");
		Note note2 = new Note("another note");

		Set notes = new HashSet();
		notes.add(note1);
		notes.add(note2);

		Task task = new Task();
		task.setNotes(notes);
		task.setTitle("Some Task");

		Session session = HibernateUtilities.getSessionFactory().openSession();
		session.beginTransaction();

		session.save(note1);
		session.save(note2);
		
		
		// insert Hibernate code to store the above data in the database here.
		// Remember: the bug that adds the name="" property to the
		// <session-factory> tag.
		// When editing the file through the GUI editor.

		session.getTransaction().commit();
		session.close();

		// test output
		System.out.println("Task Title: " + task.getTitle());
		System.out.println("Created: " + task.getDateCreated());
		System.out.println("Completed: " + task.isComplete());
		System.out.println("Notes:");
		Iterator noteItr = notes.iterator();
		while (noteItr.hasNext())
		{
			Note note = (Note) noteItr.next();
			System.out.println(note.getNote());
		}

	}
}
