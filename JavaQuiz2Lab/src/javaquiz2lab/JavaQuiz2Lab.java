
package javaquiz2lab;

import java.util.Scanner;

public class JavaQuiz2Lab
{
public static void main(String[] args)
    {
       System.out.println("How Many Employees?");
       Scanner input = new Scanner(System.in);
       int numOfEmp = input.nextInt();
       
       Employee[] employees = new Employee[numOfEmp];
       
       for(int i = 0; i < employees.length; i++)
       {
           System.out.println("Enter Employee " + (i+1) + " First Name");
           String fname = input.next();
           System.out.println("Enter Employee " + (i+1) + " Last Name");
           String lname = input.next();
           System.out.println("Enter Hourly rate for " + fname + " " + lname);
           double pay = input.nextDouble();
           
           employees[i] = new Employee(fname, lname, pay);
           
           System.out.println("How many hours has " + fname + " " + lname + "  worked?");
           employees[i].setHoursWorked (input.nextInt());  
           
           double earnedPay = CalculatePayroll(employees[i]);
           
           System.out.println(fname + " " + lname + "  worked earned " + earnedPay);
       }
       
       double totalPayroll = CalculatePayroll(employees);

       System.out.println("Total payroll this period is: $" + totalPayroll);
        
    }

    //Payroll calculation is hours * payPerHour for first 40 hours
    //Time and a half for anything over 40
    //Remember that lowest unit for money is a penny (can't pay $14.224)
	
    private static double CalculatePayroll(Employee e)
    {
       
       double hourly = 0; 
       double overtime = 0;
       double totalPay = 0;
       double payroll = 0;
       
       if(e.hoursWorked >= 40)
       {
           hourly = (e.hoursWorked * e.newPay);
           overtime = hourly + ((e.hoursWorked - 40) * (e.newPay / 2));
           totalPay = (hourly + overtime);
           payroll = totalPay;       
       }
       else
       {
           totalPay = (e.hoursWorked * e.newPay);
           
       }
       
       return totalPay;
       
        
    }
    
    private static double CalculatePayroll( Employee [] e)
    {
       // this method should calculate payroll for a given array of employees
       // hint: think code reuse and overloading, how can you use it to your advantage?
        
       return 0;
    }
  
}
