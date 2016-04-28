
package evansquiz1lab2;

import java.io.File;


public interface SimpleFileManager 
{
    // this method saves a string of text to a specified file
    // if file exists and shouldOverwrite is false, throw an exception
    // if file exists and shouldOverwrite is true, overwrite the file
    // return true on successful save, return false if saving failed for whatever reason
    // make sure no matter what happens, file gets closed
    boolean SaveToFile(String textToSave, String fileName, boolean shouldOverwrite);
    
    // same as above, except takes a File object instead of filename string
    boolean SaveToFile(String textToSave, File file, boolean shouldOverwrite);
    
    // this method reads and returns first string from specified file
    // if the file does not exist, throw an exception
    // make sure no matter what happens, file gets closed
    String ReadFromFile(String fileName);
}
