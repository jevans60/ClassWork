
package hw5.pkg23;

import java.util.Scanner;


public class HW523
{

   public static void main(String[] args)
    {
       double x1, x2, x3, y1, y2, y3;
       double sideA, sideB, sideC;
       
       Scanner point = new Scanner(System.in);
       
       System.out.print("Enter first cord.: \n");
       x1 = point.nextDouble(); 
       y1 = point.nextDouble();
       
       System.out.print("Enter Second cord.: \n");
       x2 = point.nextDouble(); 
       y2 = point.nextDouble();
       
       System.out.print("Enter third cord.: \n");
       x3 = point.nextDouble(); 
       y3 = point.nextDouble();
       
       //A = arccos((a*a-b*b-c*c)/(-2*b*c))0
       
       sideA = sideLength(x1,y1,x2,y2);
       sideB = sideLength(x2,y2,x3,y3);
       sideC = sideLength(x3,y3,x1,y1);
       

       
       System.out.print("Angle 1 is: " + angle(sideA, sideB, sideC) + "\n");
       System.out.print("Angle 2 is: " + angle(sideB, sideC, sideA) + "\n");
       System.out.print("Angle 3 is: " + angle(sideC, sideA, sideB) + "\n");
       
       //
       // enter 3 points of triangle
        
       // display degrees   
       // round to two decimal points 
    }
    
    public static double angle(double x, double y, double z)
    {
        double angle = Math.acos((x*x - y*y - z*z)/(-2*y*z));
        double temp = ((int)(angle*100))/100.0;
        return temp; 
    }
    
    public static double sideLength(double x1, double y1, double x2, double y2)
    {
        double a = Math.abs(x1-x2);
        double b = Math.abs(y1-y2);
        return Math.sqrt((a*a)+(b*b));
    }
}
