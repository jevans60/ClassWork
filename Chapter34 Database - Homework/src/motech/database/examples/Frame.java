package motech.database.examples;

import java.awt.BorderLayout;

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
        JComboBox cb1 = new JComboBox();
        JComboBox cb2 = new JComboBox();
        JButton b1 = new JButton("Find Film");
        
        p1.add(cb1);
        p1.add(cb2);
        p1.add(b1);
        add(p1);
        
        
        JPanel p2 = new JPanel();
        JTextArea t1 = new JTextArea();
        
        p2.add(t1);
        add(p2, BorderLayout.SOUTH);
	}
}
	