
package hw16.pkg3;

import javax.swing.*;

public class HW163 
{

  public static void main(String[] args) 
  {
    MoveableCircle frame = new MoveableCircle();
    frame.pack();
    frame.setTitle("Moveable Circle");
    frame.setSize(300, 300);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
   }
}