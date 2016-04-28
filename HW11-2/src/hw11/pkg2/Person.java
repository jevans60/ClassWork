
package hw11.pkg2;

public class Person
{
    protected String name;
    protected String phoneNumber;
    protected String address;
    protected String email;
    
    Person(String name)
    {
        this.name = name;
    }
    
    @Override
    public String toString()
    {
        return "Person class, name = " + name;
    }
}
