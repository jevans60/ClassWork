
package finalcarclass;


public class FinalCarClass 
{

    public static void main(String[] args) 
    {
        Car c1 = new Car ();
        c1.setMake("Ford ");
        c1.setModel("Focus ");
        c1.setYear(2012);
        
        Car c2 = new Car("Toyota", "Corolla", 2000);
        
        System.out.println(c2.toString());     
        System.out.println(c1);
        System.out.println("Number of Cars: " + Car.getNumOfCars());
       
    }
}    

