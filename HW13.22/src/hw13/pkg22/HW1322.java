
package hw13.pkg22;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;


public class HW1322 
{

    public static void main(String[] args) 
    {
        Octagon frame = new Octagon();
        //frame.setLayout(new GridLayout(2,0));
        frame.setLocationRelativeTo(null);
        frame.setTitle("Stop Sign");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 250);
        frame.setVisible(true);
    }
}
    


