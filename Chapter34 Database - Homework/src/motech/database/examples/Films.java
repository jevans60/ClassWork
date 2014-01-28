package motech.database.examples;

public class Films
{
	private int FilmId;
	private String FilmName;
	
	public int getFilmId() 
	{
		return FilmId;
	}
	public void setFilmId(int filmId) 
	{
		FilmId = filmId;
	}
	
	public String getFilmName() 
	{
		return FilmName;
	}
	public void setFilmName(String filmName) 
	{
		FilmName = filmName;
	}
	
	@Override
	public String toString()
	{
		return FilmName;
	}
}
