package com.motech;

import java.util.Set;

public class Course
{
	private int id;
	private String courseName;
	private float creditHours;
	private Set students;
	private Instructor instructor;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getCourseName()
	{
		return courseName;
	}
	public void setCourseName(String courseName)
	{
		this.courseName = courseName;
	}
	public float getCreditHours()
	{
		return creditHours;
	}
	public void setCreditHours(float creditHours)
	{
		this.creditHours = creditHours;
	}
	public Set getStudents()
	{
		return students;
	}
	public void setStudents(Set students)
	{
		this.students = students;
	}
	public Instructor getInstructor()
	{
		return instructor;
	}
	public void setInstructor(Instructor instructor)
	{
		this.instructor = instructor;
	}
	
	
}
