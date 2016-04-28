
package hw4.pkg43;

import java.util.Scanner;

public class HW443
{
    public static void main(String[] args)
    {
        System.out.println("Please enter number of seconds: ");
        Scanner input = new Scanner(System.in);
        int seconds = input.nextInt();
        
        while(seconds !=0)
        {
        System.out.println("*************************");
        System.out.println(seconds + "seconds remaining");
        seconds--;
        }
                
    }
}
