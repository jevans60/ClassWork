/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2testing;


public class Chapter2testing
{

    public static void main(String[] args) {
        final int minutesPerHour = 60;
        final int secondsPerMinute = 60;
        final int secondsPerHour = secondsPerMinute * minutesPerHour;
        
        //obtains hours and minutes from seconds
        int originalSeconds = 3890;
        int hours = originalSeconds / secondsPerHour;
        int remainingSeconds = originalSeconds % secondsPerHour;
        
        int minutes = remainingSeconds / secondsPerMinute;
        
        remainingSeconds = remainingSeconds % secondsPerMinute;
        
        System.out.println("Hours: " + hours);
        System.out.println("Munites: " + minutes);
        System.out.println("Seconds: " + remainingSeconds);
        
        
        // 60 seconds per min, 60 min per hour
        //3600 seconds per hour
    }
}
