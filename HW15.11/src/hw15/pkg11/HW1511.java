
package hw15.pkg11;

import java.util.ArrayList;


public class HW1511 
{

    public static void main(String[] args) 
    {
        GeometricObject go = new Circle(5);
        GeometricObject go2 = new Circle(6);
        
        Circle c1 = new Circle(6);
        Circle c2 = new Circle(6);
        Circle c3 = new Circle(7);
        
        System.out.println(c1.compareTo(c2));
        System.out.println(c1.compareTo(c3));
        System.out.println(c2.compareTo(c3));
        System.out.println(c2.compareTo(c2));
        
        System.out.println(go.getArea());
        System.out.println(go.getPerimeter());
        
        System.out.println(go2.getArea());
        System.out.println(go2.getPerimeter());
    }

}
