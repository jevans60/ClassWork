
package hw11.pkg2;

public class Faculty extends Employee
{
    protected String officeHours;
    protected String rank;
    
      Faculty(String name)
    {
        super(name);
    }
    
    @Override
    public String toString()
    {
        return "Faculty class, name = " + name;
    }
}
