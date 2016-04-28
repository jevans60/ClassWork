
package hw5.pkg3;

import java.util.Scanner;

public class HW53
{

    public static void main(String[] args) 
    {
        // Get input
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter an number to check for palindrome: ");
        int palindrome = input.nextInt();
        // Ouput is or is not a palindrome
        if(isPalindrome(palindrome))
        {
            System.out.println("Number: " + "'" + palindrome + "'" + " is a palindrome!");
        }else
        {
            System.out.println("Number: " + "'" +palindrome + "'" + " is not a palindrome!");
        }       
    }
    
    public static boolean isPalindrome(int number)
    {
    //move number to hold    
    int palindrome = number; 
        int reverse = 0;
    //test for palindrome
        while (palindrome != 0) 
        {
            int digit = palindrome % 10;
            reverse = reverse * 10 + digit;
            palindrome = palindrome / 10;
        }

        //return true or false
        if (number == reverse) 
        {
            return true;
        }
            else
            {
            return false;
            }
    }
}
