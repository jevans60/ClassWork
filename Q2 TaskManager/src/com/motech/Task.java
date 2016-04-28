package com.motech;

import java.util.Date;
import java.util.Set;

public class Task
{
	private int id;
	private String title;
	private Set notes;
	private boolean isComplete;
	private Date dateCreated;
	private Date dateCompleted;

	public Task()
	{
		this.isComplete = false;
		this.dateCreated = new Date();
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public Set getNotes()
	{
		return notes;
	}

	public void setNotes(Set notes)
	{
		this.notes = notes;
	}

	public boolean isComplete()
	{
		return isComplete;
	}

	public void setComplete(boolean isComplete)
	{
		this.isComplete = isComplete;
	}

	public Date getDateCreated()
	{
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated)
	{
		this.dateCreated = dateCreated;
	}

	public Date getDateCompleted()
	{
		return dateCompleted;
	}

	public void setDateCompleted(Date dateCompleted)
	{
		this.dateCompleted = dateCompleted;
	}

}
