
package finalperfectnumber;


public class FinalPerfectNumber 
{

    public static void main(String[] args) 
    {
        for (int i = 1; i < 1000; i++) 
        {
            if(isPerfect(i))
            {
            System.out.println(i);
            }
        }
    }
    
    private static boolean isPerfect(int x)
    {
        int number = 0;
        for (int i = 1; i < x; i++) 
        {
            if(x % i == 0) 
            {
                number += i;
            }
        }
        return(number == x);
    }

}
