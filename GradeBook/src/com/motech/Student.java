package com.motech;

import java.util.Set;

public class Student
{
	private int id;
	private String name;
	private float gpa;
	
	private Set addresses;
	private Set courses;
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public float getGpa()
	{
		return gpa;
	}
	
	public void setGpa(float gpa)
	{
		this.gpa = gpa;
	}

	public Set getAddresses()
	{
		return addresses;
	}

	public void setAddresses(Set addresses)
	{
		this.addresses = addresses;
	}

	public Set getCourses()
	{
		return courses;
	}

	public void setCourses(Set courses)
	{
		this.courses = courses;
	}
	
}
