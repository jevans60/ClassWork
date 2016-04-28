
package hw8.pkg1;

public class HW81
{

    public static void main(String[] args) 
    {
     Rectangle rectangle1 = new Rectangle();
     System.out.println("The area of the rectangle having height of " + rectangle1.height +
             " and a width of " + rectangle1.width + " is " + rectangle1.getArea()); 
     System.out.println("The perimeter of the rectangle having height of " + rectangle1.height +
             " and a width of " + rectangle1.width + " is " + rectangle1.getPerimeter());
     
     System.out.println("*************************");
     
     Rectangle rectangle2 = new Rectangle(4, 40);
     System.out.println("The area of the rectangle having height of " + rectangle2.height +
             " and a width of " + rectangle2.width + " is " + rectangle2.getArea()); 
     System.out.println("The perimeter of the rectangle having height of " + rectangle2.height +
             " and a width of " + rectangle2.width + " is " + rectangle2.getPerimeter());
     
     System.out.println("*************************");
     
     Rectangle rectangle3 = new Rectangle(3.5, 35.9);
     System.out.println("The area of the rectangle having height of " + rectangle3.height +
             " and a width of " + rectangle3.width + " is " + rectangle3.getArea()); 
     System.out.println("The perimeter of the rectangle having height of " + rectangle3.height +
             " and a width of " + rectangle3.width + " is " + rectangle3.getPerimeter());
     
//       rectangle3.setHeight(50);
//        System.out.println("The area of the rectangle having height of " + rectangle3.height +
//             " and a width of " + rectangle3.width + " is " + rectangle3.getArea()); 
        
        
    }
}
