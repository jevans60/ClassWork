
package hw5.pkg2;
import java.util.Scanner;

public class HW52
{

    public static void main(String[] args) 
    {
        // Enter amount then calculate
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter an integer to sum: ");
        int number = input.nextInt();
        int numInput = Math.abs (number); //gets absolute value of a number
        int sum = 0;
        int i = 0;

        //loop to run through all numbers in an integer no matter how many
        while(numInput / Math.pow(10, i) > 0)
        {
            sum += getNumber(numInput, i);
            i++;
        }


        // Ouput results
        System.out.println("The sum of the digits in " + "'" + number + "'" + " = " + sum);
    }

    public static int getNumber(int num, int power)
    {
        return (num % (int)Math.pow(10, power + 1)) / (int)Math.pow(10, power);
    }
}
