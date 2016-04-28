/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salestax;

public class SalesTax
{

    public static void main(String[] args) 
    {
        // Sales Tax conversion
        int someValue = 10;
        double truncateThis = someValue / 3d;
        
        double stepOne = truncateThis * 100;
        int stepTwo = (int)stepOne;
        
        double finalStep = stepTwo / 100D;
        
        System.out.println(finalStep);
        
        
        
    }
}
