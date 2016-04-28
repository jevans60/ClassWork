
package hw2.pkg8;

import javax.swing.JOptionPane;

public class HW28
{
    
    public static void main(String[] args) 
    {
        // Display current time with varying timezones
        long milliseconds = System.currentTimeMillis();
        
        long seconds = milliseconds / 1000;
        int currentSecond = (int)(seconds % 60);
        
        long minutes = seconds / 60;
        int currentMinute = (int)(minutes % 60);
        
        long hours = minutes / 60;
        
        int currentHour = (int)(hours % 24);
        
        String hourString = JOptionPane.showInputDialog(null, 
               "Enter your GMT ", "Time Zone", 
               JOptionPane.QUESTION_MESSAGE);
        int hour = Integer.parseInt(hourString);
        
        int correctedHour = hour + currentHour + 24;
              
        System.out.println("The time is currently " + correctedHour + ":" + 
                currentMinute + ":" + currentSecond);
               
        
        
    }
}
