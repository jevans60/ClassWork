
package hw13.pkg9;


import java.awt.GridLayout;
import javax.swing.JFrame;

public class HW139 
{

    public static void main(String[] args) 
    {
        DrawArcs frame = new DrawArcs();
        frame.setLayout(new GridLayout(2,2));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 300);
        frame.setVisible(true);
    }

}
