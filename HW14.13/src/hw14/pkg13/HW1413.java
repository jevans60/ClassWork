
package hw14.pkg13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class HW1413 
{

    public static void main(String[] args) 
    {
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;
        
        Scanner fileReader = null;
        File file = new File("C:\\Javafiles\\JavaQuiz2Lab.java");
        //System.out.println(file.exists());
        
        try
        {
            fileReader = new Scanner(file);
            while(fileReader.hasNext())
            {
                lineCount++;
                String line = fileReader.nextLine();
                String[] words = line.split(" ");
                //wordCount += words.length;
                for(String word:words)
                {
                    String tempWord = word.trim();
                    if(!tempWord.equals(""))
                    {  
                        wordCount++;
                        charCount += word.length();
                    }
                }
            }
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Problem reading file: " + ex.toString());
        }
        
        catch(Exception ex)
        {
            //log it
            throw ex;
        }
        finally
        {
            fileReader.close();
        }
        
        System.out.println("Document contains " + lineCount + " lines");
        System.out.println("Document contains " + wordCount + " words");
        System.out.println("Document contains " + charCount + " characters");
        
    }

}
