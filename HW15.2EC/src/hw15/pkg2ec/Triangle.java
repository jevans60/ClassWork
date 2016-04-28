
package hw15.pkg2ec;

import java.util.Scanner;

public class Triangle extends GeometricObject 
{
    double side;
    double side2;
    double side3;
    String color;
    int filled;

   
    
    double setSide()
    {
        System.out.println("Enter your first side: ");
        Scanner input = new Scanner(System.in);
        side = input.nextDouble();
        
        return side;
    }
    
    double setSide2()
    {
        System.out.println("Enter your second side: ");
        Scanner input = new Scanner(System.in);
        side2 = input.nextDouble();
        
        return side2;
    }
    
    double setSide3()
    {
        System.out.println("Enter your final side: ");
        Scanner input = new Scanner(System.in);
        side3 = input.nextDouble();
        
        return side3;
    }
   
    @Override
    public double getArea() 
    {
        //area = 1/2 * b * h not sure how to calculate height, just showing it works
        double area = (side * side2) / 2;
        return area;
        
    }

    public String setColor()
    {
        System.out.println("Enter the Color of the Triangle: ");
        Scanner input = new Scanner(System.in);
        color = input.nextLine();
        return color;        
    }
    
    public String printColor()
    {
        return this.color;
    }
    
    public boolean isFilled()
    {
        System.out.println("Is the Triangle filled?(1 for YES, 0 for NO): ");
        Scanner input = new Scanner(System.in);
        filled = input.nextInt();
        
        if(filled < 1)
        {
            System.out.print("Is the triangle filled?: ");
            return false;
        }
        else
        {
            System.out.print("Is the triangle filled?: ");
            return true;
        }
    }
    
    public double getPerimeter()
    {
        return this.side + this.side2 + this.side3;
    }
}

