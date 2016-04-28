
package quiz3lab;

public class Domestic extends Car
{
    Domestic (String color, String make, String model)
    {
        super(color, make, model);
    }
    
    protected String dom()
    {
        return "This is a domestic car";
    }
}
