
package hw12.pkg1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Frame extends JFrame
{
    public Frame()
    {
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 40));
        panel1.add(new JButton("Button 1"));
        panel1.add(new JButton("Button 2"));
        panel1.add(new JButton("Button 3"));
        setTitle("Exercise12_1");
        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.add(new JButton("Button 4"));
        panel2.add(new JButton("Button 5"));
        panel2.add(new JButton("Button 6"));
        
        panel2.add(panel1, FlowLayout.LEFT);
        add(panel2, BorderLayout.EAST);
    }
}
