
package hw6.pkg8;

import java.util.Scanner;

public class HW68
{

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
        for (int i = 0; i < number.length; i++) 
        {
        System.out.print(number[i] + " ");    
        }
        System.out.println();
        System.out.println(average(number));
        
        
    }
    public static int average(int[] array)
    {
        int sum = 0;
        
        for(int i = 0; i < 10; i++)
        {
        sum += array[i];
        }
        int arraySum2 = sum / 10;
        return  arraySum2;
    }
    
    public static double average(double[] array)
    {
        double sum1 = 0;
        for (int j = 0; j < 10; j++) 
        {
        sum1 += array[j];    
        }
        double arraySum = sum1 / 10;
        return (arraySum);
    }
}
