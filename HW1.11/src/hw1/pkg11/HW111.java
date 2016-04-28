/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1.pkg11;
import java.text.DecimalFormat;

/**
 *
 * @author Jeff
 */
public class HW111
{
    public static void main(String[] args) {
       DecimalFormat df = new DecimalFormat("#########");
       double year1;
       double year2;
       double year3;
       double year4;
       double year5;
       double birthrate = 7;
       double deathrate = 13;
       double immigration = 45;
       double year = 31536000;
       double totalrate = (year / birthrate * 5) - (year / deathrate * 5) +
               (year / immigration * 5);
       double population = 312302486;
       double yearlypop = (year / birthrate) - (year /deathrate) + 
                   (year / immigration);
       
       System.out.println("Total population starting at first year 312,302,486");
       System.out.println(("Number of Births in 5 years ") + ( year / birthrate * 5 ));
       System.out.println(("Number of Deaths in 5 years ") + ( year / deathrate * 5 ));
       System.out.println(("Number of new immigrants in 5 years ") + ( year / immigration * 5));
       System.out.println(("Total number of population increase in 5 years = ") +
               (totalrate));
          
           year1 = (yearlypop + population);
           year2 = (year1 + yearlypop);
           year3 = (year2 + yearlypop);
           year4 = (year3 + yearlypop);
           year5 = (year4 + yearlypop);
         
           System.out.println(("Year1 population = ") + (df.format(year1)));           
           //System.out.println(("Year 1 population = ") + (year1));
           System.out.println(("Year 2 population = ") + (df.format(year2)));
           System.out.println(("Year 3 population = ") + (df.format(year3)));
           System.out.println(("Year 4 population = ") + (df.format(year4)));
           System.out.println(("Year 5 population = ") + (df.format(year5)));
        }
        
  
}
