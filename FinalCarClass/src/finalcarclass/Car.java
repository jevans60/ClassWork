
package finalcarclass;


public class Car
{
    protected String make;
    protected String model;
    protected int year;
    static int numOfCars = 0;
    
    public Car()
    {
        numOfCars++;
    }
            
    public Car(String newMake, String newModel, int newYear)
    {
        make = newMake;
        model = newModel;
        year = newYear;
        numOfCars++;
    }
    
    public static int getNumOfCars()
    {
        return numOfCars;
    }
    
    public String getMake()
    {
        return make;
    }
    
    public String getModel()
    {
        return model;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public void setMake(String make)
    {
        this.make = make;
    }
    
    public void setModel(String model)
    {
        this.model = model;
    }
    
    public void setYear(int year)
    {
        this.year = year;
    }
    
    @Override
    public String toString()
    {
        String car1 =  this.make + this.model + this.year;
        return car1;
    }
}
