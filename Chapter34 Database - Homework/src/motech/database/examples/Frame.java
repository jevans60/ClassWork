package motech.database.examples;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Frame extends JFrame
{
	public Frame()
	{
		setTitle("Film Store Database");
        setSize(640, 100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);   
        
        JPanel p1 = new JPanel();
       // JComboBox<FilmName> cb1 = new JComboBox<FilmName>();
    //    JComboBox<StoreName> cb2 = new JComboBox<StoreName>();
        JButton b1 = new JButton("Find Film");
        
   //     p1.add(cb1);
    //    p1.add(cb2);
        p1.add(b1);
        add(p1);
        
     //   cb1.addActionListener(new FilmComboBox());
     //   cb2.addActionListener(new StoreComboBox());
        
        JPanel p2 = new JPanel();
        JTextArea t1 = new JTextArea();
        
        p2.add(t1);
        add(p2, BorderLayout.SOUTH);
        
       	}
	
	class FilmComboBox implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			//TODO pull film data from database
			//TODO output number of films to t1 textarea
			
		}
		
		
	}
	
	class StoreComboBox implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			//	TODO pull store data from database
			
		}
		
	}
}

	