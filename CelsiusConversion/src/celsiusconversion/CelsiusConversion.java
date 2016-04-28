/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package celsiusconversion;

public class CelsiusConversion
{

    public static void main(String[] args) 
    {
        //calculate celsius from fahrenheit
        double fahrenheit = 96;
        double celsiusCalc = 5.0 / 9;
        double celsius = celsiusCalc * (fahrenheit - 32);
        
        System.out.println("Celsius = " + celsius);
        
        //calculate fahrentheit from celsius
        double calcFahrenheit = 9 / 5.0;
        double fahrenheitcalc = (calcFahrenheit * celsius) + 32;
        
        System.out.println("Fahrenheit = " + fahrenheitcalc);
        System.out.println();
                
    }
}
