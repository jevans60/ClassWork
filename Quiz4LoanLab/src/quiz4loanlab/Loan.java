
package quiz4loanlab;

import java.util.Date;

public class Loan
{
    private double annualInterestRate = .025;
    private int numberOfYears = 1;
    private double loanAmount = 1000;
    private Date loanDate;
    
    public Loan()
    {
    }
    
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount)
    {
        this.annualInterestRate = annualInterestRate;
        this.loanAmount = loanAmount;
        this.numberOfYears = numberOfYears;
    }
    
    public double getAnnualInterestRate()
    {
        return this.annualInterestRate;
    }
    
    public int getNumberOfYears()
    {
        return this.numberOfYears;
    }
    
    public double getLoanAmount()
    {
        return this.loanAmount;
    }
    
    public Date getDate()
    {
        return this.loanDate;
    }
    
    public void setAnnualInterestRate( double annualInterestRate )
    {
        this.annualInterestRate = annualInterestRate;
    }
    
    public void setNumberOfYears( int numberOfYears )
    {
        this.numberOfYears = numberOfYears;
    }
    
    public void setLoanAmount( double loanAmount )
    {
        this.loanAmount = loanAmount;
    }
    
    public double monthlyPayment()
    {
        double yearly = (this.loanAmount / this.numberOfYears) * this.annualInterestRate + (this.loanAmount / this.numberOfYears); 
        double monthly = (yearly / 12); 
        return monthly;
    }
    
    public double totalPayment()
    {
        double yearly1 = (this.loanAmount / this.numberOfYears) * this.annualInterestRate + (this.loanAmount / this.numberOfYears); 
        double total = (yearly1 * this.numberOfYears);
        return total;
    }
}
