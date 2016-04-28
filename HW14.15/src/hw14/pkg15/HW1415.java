
package hw14.pkg15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class HW1415 
{

    public static void main(String[] args) throws FileNotFoundException 
    {
       
        Scanner fileReader = null;
        File file = new File("C:\\Javafiles\\Exercise14_15.txt");
        try
        {
            fileReader = new Scanner(file);
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Problem reading file: " + ex.toString());
        }
        
        try
        {
        PrintWriter writer = new PrintWriter("C:\\Javafiles\\Exercise14_15.txt", "UTF-8");
        int arraySize = 100;
        int maximum = 1000;
        int nums[] = new int[arraySize];

        Random generator = new Random();
        generator.nextInt();

        for (int i = 0; i < arraySize; i++) 
        {
             nums[i] = (generator.nextInt(100)+1);
             writer.print(nums[i] + " ");
        }
       
        writer.close();
        }
        catch (UnsupportedEncodingException ex) 
        {
            Logger.getLogger(HW1415.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        try
        {
            fileReader = new Scanner(file);
            while(fileReader.hasNext()) //take into ints instead of string
            {
                String line = fileReader.nextLine();
                String[] nums = line.split(" ");
                int[] nums2; 
                Arrays.sort(nums);
                for(String number:nums)
                {
                    String tempWord = number.trim();
                    if(!tempWord.equals(""))
                    {  
                        System.out.print(number + " ");
                    }
                }
            }
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Problem reading file: " + ex.toString());
        }
        System.out.println();
    }

}
