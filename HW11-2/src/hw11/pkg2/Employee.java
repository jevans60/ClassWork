/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11.pkg2;

import java.util.Date;

public class Employee extends Person
{
    protected String office;
    protected double salary;
    protected Date dateOfHire;
    
      Employee(String name)
    {
        super(name);
    }
    
    @Override
    public String toString()
    {
        return "Employee class, name = " + name;
    }
}
