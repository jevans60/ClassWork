package com.motech;

import java.util.Set;

public class Instructor
{
	private int id;
	private String firstName;
	private String lastName;
	private String instructorName;
	private Set instructors;
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public Set getInstructors()
	{
		return instructors;
	}

	public void setInstructors(Set instructors)
	{
		this.instructors = instructors;
	}

	public String getInstructorName()
	{
		return instructorName;
	}

	public void setInstructorName(String fName, String lName)
	{
		this.instructorName = this.firstName + " " + this.lastName;
	}
}
