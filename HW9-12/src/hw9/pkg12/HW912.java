
package hw9.pkg12;
import java.util.Arrays;

public class HW912 
{

    public static void main(String[] args) 
    {
        //write a method isAnagram (string1, string2)
        //(listen, silent) should return true
        String string1 = "listen";
        String string2 = "silent";
        
        System.out.print(string1 + " and " + string2 + " are ");
        
        
        if(!isAnagram(string1, string2))
        {
            System.out.println("not anagrams ");
        }else{
        System.out.println("anagrams ");
        }
    System.out.println(isAnagram(string1, string2));
    }
    

    public static Boolean isAnagram(String s1, String s2)
    {
        char[] chars1 = toSortedArray(s1.toLowerCase());
        char[] chars2 = toSortedArray(s2.toLowerCase());
        
        String s3 = new String(chars1);
        String s4 = new String(chars2);
        
        return s3.equals(s4);
    }
    
    private static char[] toSortedArray(String s)
    {
        char[] chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++)
        {
           chars[i] = s.charAt(i);
        }
        
        Arrays.sort(chars);
     
        return chars;
    }
}
