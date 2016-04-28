
package hw16.pkg3;


import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;



public class MoveableCircle extends JFrame
{
    public MoveableCircle()
    {
    CirclePanel c = new CirclePanel();
    ButtonPanel b = new ButtonPanel();
    add(c, BorderLayout.CENTER);
    add(b, BorderLayout.SOUTH);
    
    b.add(new JButton("Left"));
    b.add(new JButton("Right"));
    b.add(new JButton("Up"));
    b.add(new JButton("Down"));
    
    
    
    }
}
