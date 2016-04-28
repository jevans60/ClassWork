
package hw4.pkg24;

public class HW424
{
    public static void main(String[] args) 
    {
        double sum1 = 1;
        double sum2 = 3;
        double sum3;
        double sum4 = 0;
      
        for (int i = 0; i < 100; i++) 
        {
           sum3 = (sum1 / sum2);
           sum4 += sum3;
           sum1 = sum1 + 2;
           sum2 = sum2 + 2;
           
        }
        System.out.println(sum4);
        

        
    }
}
