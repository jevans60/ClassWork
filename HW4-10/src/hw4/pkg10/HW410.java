
package hw4.pkg10;


public class HW410
{

    public static void main(String[] args) 
      {
        /* display a table that shows all numbers from 100 - 200 that are divisible
        by 5 or 6, but not both. Show 10 per line
        */
        //create the variable with numbers from 100-200
        int j = 0;      
        for (int i = 100; i < 201; i++) 
        {
           
            int num1 = i % 5;
            int num2 = i % 6;
        //create the table
           
            if (((num1 == 0) || (num2 == 0)) && ((num1 != 0) ^ (num2 != 0)))
             {
                 System.out.printf("%-4d", i);
                 j++;
                 {
                     if(j == 10)
                     {
                     System.out.println();
                     j = 0;
                     }
                  }
              }
        }
   }        
}
        