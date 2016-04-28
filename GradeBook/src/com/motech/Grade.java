package com.motech;

public class Grade
{
	private int id;
	private Student student;
	private Course course;
	private float finalGrade;
	
	public Grade(){};
	public Grade(Student student, Course course, float grade)
	{
		this.student = student;
		this.course = course;
		this.finalGrade = grade;
		
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public Student getStudent()
	{
		return student;
	}
	
	public void setStudent(Student student)
	{
		this.student = student;
	}
	
	public Course getCourse()
	{
		return course;
	}
	
	public void setCourse(Course course)
	{
		this.course = course;
	}
	
	public float getFinalGrade()
	{
		return finalGrade;
	}
	
	public void setFinalGrade(float finalGrade)
	{
		this.finalGrade = finalGrade;
	}
	
}
