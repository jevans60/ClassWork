
package hw12.pkg8;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class Frame  extends JFrame
{
    public Frame()
    {
        setSize(400, 400);
        setTitle("Exercise 12_8");
        setLayout(new GridLayout(2, 0));
        Font font = new Font("Times New Roman", Font.BOLD,20 );
        
        JTextField j1 = new JTextField("black");
        j1.setForeground(Color.BLACK);
        j1.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
        j1.setFont(font);
        j1.setToolTipText("Black");
        
        JTextField j2 = new JTextField("blue");
        j2.setForeground(Color.BLUE);
        j2.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
        j2.setFont(font);
        j2.setToolTipText("Blue");
        
        JTextField j3 = new JTextField("cyan");
        j3.setForeground(Color.CYAN);
        j3.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
        j3.setFont(font);
        j3.setToolTipText("Cyan");
        
        JTextField j4 = new JTextField("green");
        j4.setForeground(Color.GREEN);
        j4.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
        j4.setFont(font);
        j4.setToolTipText("Green");
        
        JTextField j5 = new JTextField("magenta");
        j5.setForeground(Color.MAGENTA);
        j5.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
        j5.setFont(font);
        j5.setToolTipText("Magenta");
        
        JTextField j6 = new JTextField("orange");
        j6.setForeground(Color.ORANGE);
        j6.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
        j6.setFont(font);
        j6.setToolTipText("Orange");
        
        add(j1);
        add(j2);
        add(j3);
        add(j4);
        add(j5);
        add(j6);
        
    }    
}
