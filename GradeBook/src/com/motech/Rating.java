package com.motech;

public class Rating
{
	private int id;
	private Instructor instructor;
	private Course course;
	private double rate;

	public Rating()
	{
		
	}
	
	private Rating(Instructor instructor, Course course, double rate)
	{
		this.setInstructor(instructor);
		this.setCourse(course, rate);
		this.setRate(rate);
		
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}

	public Instructor getInstructor()
	{
		return instructor;
	}

	public void setInstructor(Instructor instructor)
	{
		this.instructor = instructor;
	}

	public Course getCourse()
	{
		return course;
	}

	public void setCourse(Course course, double rate)
	{
		this.course = course;
		this.rate = rate;
	}

	public double getRate()
	{
		return rate;
	}

	public void setRate(double rate)
	{
		this.rate = rate;
	}

	
	
}
