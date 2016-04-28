/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11.pkg2;

public class Staff extends Employee
{
    protected String title;
    
      Staff(String name)
    {
        super(name);
    }
    
    @Override
    public String toString()
    {
        return "Staff class, name = " + name;
    }
}
