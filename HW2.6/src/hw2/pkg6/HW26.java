
package hw2.pkg6;

import javax.swing.JOptionPane;


public class HW26
{

    public static void main(String[] args) 
    {
        // Sum the digits of an integer between 0 and 1000
        int num1;
        int num2;
        int num3;
        
        String numString = JOptionPane.showInputDialog(null, 
               "Enter a number between 0 and 1000", "Summing the digits of an integer", 
               JOptionPane.QUESTION_MESSAGE);        
        int num = Integer.parseInt(numString);
        
        num3 = num % 10;
        num2 = (num % 100) / 10;
        num1 = (num %1000) / 100;
                       
        int sum = num1 + num2 + num3;
        
        JOptionPane.showMessageDialog(null, "The sum of the digits is " + sum);
        
        
        
        
    }
}
