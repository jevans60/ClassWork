
package hw6.pkg12;

import java.util.Scanner;
import java.util.Arrays;


public class HW612 {

   
    public static void main(String[] args) 
    {
    System.out.println("Enter in 10 doubles: ");
        Scanner input = new Scanner(System.in);
        double[] number = new double[10];
        double num0 = input.nextDouble();
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        double num4 = input.nextDouble();
        double num5 = input.nextDouble();
        double num6 = input.nextDouble();
        double num7 = input.nextDouble();
        double num8 = input.nextDouble();
        double num9 = input.nextDouble();
                
        number[0] = num0;
        number[1] = num1;
        number[2] = num2;
        number[3] = num3;
        number[4] = num4;
        number[5] = num5;
        number[6] = num6;
        number[7] = num7;
        number[8] = num8;
        number[9] = num9;    
    }

    public static double sortArray(double [] array)
        {
            double[] numArray = new double[array.length];
            for (int i = 0; i < array.length; i++)
        {
           numArray[i] = array.length;
        }
            Arrays.sort(numArray);
            
            
            return 0; //what to return?
        }
}
