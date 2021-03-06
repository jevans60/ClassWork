package motech.database.main;

import java.sql.SQLException;

import motech.database.examples.Frame;
import motech.database.examples.SimpleJDBC;

public class Program {
	public static void main(String[] args) 
		throws ClassNotFoundException, SQLException {
		
		Frame frame = new Frame();
		frame.pack();
		
		//Example 1 - simple connection to Sakila database to print all data in city table.
		SimpleJDBC.PrintResult();
		
		//Example 2 - connection to Sakila that pulls data into a simple applet.
		//ShowFilms sf = new ShowFilms();
		//sf.init();
	}
}
