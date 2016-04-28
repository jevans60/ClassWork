package quiz3lab;


public class Quiz3Lab 
{

    public static void main(String[] args) 
    {
        Car car1 = new Car("Red", "Chevy", "Cobalt");
        System.out.println(car1.carCompare());
        Car car2 = new Car("Blue", "Ford", "focus");
        System.out.println(car2.carCompare());
        System.out.println(car1.carCompare().equalsIgnoreCase(car2.carCompare()));
        System.out.println("************************************");
        Car car3 = new Car("Red", "Chevy", "Cobalt");
        
        System.out.println(car3.carCompare());
        System.out.println(car1.carCompare());
        System.out.println(car1.carCompare().equalsIgnoreCase(car3.carCompare()));
        System.out.println("************************************");
        System.out.println(car3.carCompare());
        System.out.println(car2.carCompare());
        System.out.println(car2.carCompare().equalsIgnoreCase(car3.carCompare()));
        System.out.println("************************************");
        System.out.println(car1.move());
        System.out.println(car2.honk());
    }

}
