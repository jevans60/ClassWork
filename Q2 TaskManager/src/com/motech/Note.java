package com.motech;

public class Note
{
	private int id;
	private String note;

	public Note()
	{
	}

	public Note(String note)
	{
		this.setNote(note);
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getNote()
	{
		return note;
	}

	public void setNote(String note)
	{
		this.note = note;
	}

}
