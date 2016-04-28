
package hw14.pkg3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class HW143 
{

    public static void main(String[] args) 
    {
        int arraySize = 100;
        int maximum = 1000;
        int nums[] = new int[arraySize];

        Random generator = new Random();
        generator.nextInt();

        for (int i = 0; i < arraySize; i++) 
        {
             nums[i] = (generator.nextInt(100)+1);
        }

        try
        {
            System.out.println("Please enter a number between 1-100: ");
            Scanner input = new Scanner(System.in);
            int index = input.nextInt();
            System.out.println("The array item you indexed is: " + nums[index]);
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("The array index is Out of Bounds");
        }
        
    }

}
