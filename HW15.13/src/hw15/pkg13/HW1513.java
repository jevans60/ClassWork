
package hw15.pkg13;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HW1513 
{

    public static void main(String[] args) 
    {
        GeometricObject oct = new Octagon(5);
        System.out.println("area: " + oct.getArea());
        System.out.println();
        
        Octagon oct2 = new Octagon(6);
        Octagon oct3 = new Octagon(1);
        try {
            oct3 = (Octagon) oct2.clone();
            } 
                catch (CloneNotSupportedException ex) 
            {
                Logger.getLogger(HW1513.class.getName()).log(Level.SEVERE, null, ex);
            }
        System.out.println("area: " + oct3.getArea());
        System.out.println("perimeter: " + oct3.getPerimeter());
        System.out.println();
        System.out.println("area: " + oct2.getArea());
        System.out.println("perimeter: " + oct2.getPerimeter());
        
        
        Octagon o1 = new Octagon(7);
        Octagon o2 = new Octagon(8);
        Octagon o3 = new Octagon(9);
        System.out.println();

        System.out.println("perimeter: " + o3.getPerimeter());
        System.out.println();
        
        System.out.println(o1.compareTo(o2));
        System.out.println(o1.compareTo(o3));
        System.out.println(o2.compareTo(o3));
        System.out.println(o2.compareTo(o2));
        
    }

}
