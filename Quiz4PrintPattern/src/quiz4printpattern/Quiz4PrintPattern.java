
package quiz4printpattern;


public class Quiz4PrintPattern 
{
// cant figure out how to get rid of 2 extra print lines in output, 
    //but other than that it works
    public static void main(String[] args) 
    {
        String pattern = "**********";
        int x = 0;
        int y = 10;
        int a = 0;
        int b = 1;
       
        for (int j = 10; j != 0; j--)
        {           
            for (int i = 9; i != 0; --i) 
            {
                System.out.print(pattern.charAt(i));
                x++;
                if((x == y) && (y != 0))
                    {
                        System.out.println("  *   *   *");
                        x = 0;
                        y--;
                    }
            }
        }
        System.out.println();
        for (int k = 0; k < 10; k++) 
        {
            for (int l = 0; l < 10; l++) 
            {
                System.out.print(pattern.charAt(l));
                a++;
                if((a == b) && (b < 10))
                    {
                        System.out.println("  *   *   *");
                        a = 0;
                        b++;
                    }
            }
        }
    }

}
