
package hw15.pkg2ec;


public class HW152EC 
{

    public static void main(String[] args) 
    {
        GeometricObject tri = new Triangle();
        
        Triangle t1 = new Triangle();
        t1.setSide();
        t1.setSide2();
        t1.setSide3();
        t1.setColor();
        System.out.println(t1.isFilled());
        System.out.println("The color of the triangle is: " + t1.printColor());
        System.out.println("The area of the triangle is: " + t1.getArea());
        System.out.println("The perimeter of the triangle is: " + t1.getPerimeter());
        
    }

}
