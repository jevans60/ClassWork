
package hw8.pkg3;
import java.util.Date;
public class HW83
{
    public static void main(String[] args) 
    {
        
        //java.util.Date date = new java.util.Date();
       // for (int i = 0; i < 10; i++) 
        
            
            Date date = new Date(10000);
            System.out.println(date.toString());    
           
            Date date1 = new Date(100000);
            System.out.println(date1.toString());
            
            Date date2 = new Date(1000000);
            System.out.println(date2.toString());
            
            Date date3 = new Date(10000000);
            System.out.println(date3.toString());
            
            Date date4 = new Date(100000000);
            System.out.println(date4.toString());
            
            Date date5 = new Date(1000000000);
            System.out.println(date5.toString());
            
            Date date6 = new Date(1000000000 * 10);
            System.out.println(date6.toString());
            
            Date date7 = new Date(1000000000 * 100);
            System.out.println(date7.toString());
       // date.setTime(1000000);
      //  System.out.println(date.toString());
    
        
    }
}
