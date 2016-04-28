
package hw2.pkg2;

import javax.swing.JOptionPane;


public class HW22
{

    public static void main(String[] args) 
    {
      //Calculate the volume of a cylinder
       double cylinderArea;
       double cylinderVolume;
       String radiusString = JOptionPane.showInputDialog(null, 
               "Enter the Radius of the cylinder", "Cylinder dimension input", 
               JOptionPane.QUESTION_MESSAGE);
        double radius = Double.parseDouble(radiusString);
        
       String lengthString = JOptionPane.showInputDialog(null, 
               "Enter the Length of the cylinder", "Cylinder dimension input", 
               JOptionPane.QUESTION_MESSAGE);
        double length = Double.parseDouble(lengthString);
        
        cylinderArea = (radius * radius) * 3.14159;
        cylinderVolume = (cylinderArea * length);
        
        String outputA = ("The area of the cylinder is ") + cylinderArea;
        JOptionPane.showMessageDialog(null, outputA);
        
        String outputB = ("The volume of the cylinder is ") + cylinderVolume;
        JOptionPane.showMessageDialog(null, outputB);
                
        
        
      
        
    
    
    }
}
