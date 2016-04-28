
package evansquiz1lab2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EvansQuiz1Lab2 
{

    public static void main(String[] args) 
    {
        
        FileManager file = new FileManager();
        file.SaveToFile(file.textToSave, file.fileName, true);//Initial creating of file
        file.setFileName(file.setName); 
        
        file.ReadFromFile(file.fileName);
        
        file.SaveToFile("This is a test of the emergency broadcast network!", 
                file.fileName, false); //Second attempt to write to file
        
        file.ReadFromFile(file.fileName); //Read from file
        System.out.println(file.ReadFromFile(file.fileName)); //Output the string
        
    }

}
