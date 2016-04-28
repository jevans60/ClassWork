
package hw11.pkg2;

public class Student extends Person
{
    protected String classStatus;
    
    Student(String name)
    {
        super(name);
    }
    
  @Override
    public String toString()
    {
        return "Student class, name = " + name;
    }
  
}
