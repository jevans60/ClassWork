
package evansquiz1lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileManager implements SimpleFileManager
{
    String setName;
    String fileName = "C:\\Javafiles\\EvansQuiz1lab2.txt";
    String textToSave = "This is a test, this is only a test!";

    public String setFileName(String setName)
    {
        setName = fileName;
        return fileName;
    }
    
    @Override
    public boolean SaveToFile(String textToSave, String fileName, boolean shouldOverwrite) 
    {
        try 
        {
            PrintWriter writer = new PrintWriter(fileName, "UTF-8");
            writer.print(textToSave);
            writer.close();
            return true;
        } 
        catch (FileNotFoundException ex) 
        {
            System.out.println("Problem reading file: " + ex.toString());
            return false;
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return false;
        
    }

    @Override
    public boolean SaveToFile(String textToSave, File file, boolean shouldOverwrite) 
    {
        try 
        {
            PrintWriter writer = new PrintWriter(setFileName(setName), "UTF-8");
            writer.close();
            return true;
        } 
        catch (FileNotFoundException ex) 
        {
            System.out.println("Problem reading file: " + ex.toString());
            return false;
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return false;
    }

    @Override
    public String ReadFromFile(String fileName) 
    {
        Scanner fileReader = null;
        File file = new File("C:\\Javafiles\\EvansQuiz1lab2.txt");
        try
        {
            fileReader = new Scanner(file);
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Problem reading file: " + ex.toString());
        }
        String line = fileReader.nextLine();
        return line;
        
    }
    
}