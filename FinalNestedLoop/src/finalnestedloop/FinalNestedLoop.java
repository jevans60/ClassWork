
package finalnestedloop;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FinalNestedLoop 
{

    public static void main(String[] args) throws IOException 
    {
//        DOESN'T WORK YET
//        PrintWriter out;
//        out = new PrintWriter(new FileWriter("C:\\javafiles\\outputfile.txt"));
        for (int i = 0; i < 10; i++) 
        {
            printLine(i);
        }
       // out.close();
    }
    
    public static void printLine( int z )
    {
        for (int j = 0; j < 10; j++) 
        {
            int x = j + z;
            if(x < 5)
            {
                System.out.print("#\t ");
            }
            else
            {
                System.out.print(x + "\t ");
            }
        }
        System.out.println();
    }
}