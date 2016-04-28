
package quiz3lab;

public class Car extends Vehicle
{
    protected String color;
    protected String make;
    protected String model;
   
    
    Car (String color, String make, String model)
    {
        this.color = color;
        this.make = make;
        this.model = model;
    }
    
    protected String carCompare()
    {
        String s1 = this.color + this.make + this.model;
        return s1;
    }
    
}
