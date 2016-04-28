
package hw15.pkg11;

public class Circle extends GeometricObject 
{
    private double radius;
    
    public Circle(double radius)
    {
        setRadius(radius);
    }
    
    public void setRadius(double radius)
    {
        if(radius >= 0)
        {
        this.radius = radius;
        }
        else
        {
            this.radius = 0;
        }
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    @Override
    public double getArea() 
    {
        double area = getRadius() * getRadius() * Math.PI;
        return area;
    }

    @Override
    public double getPerimeter() 
    {
        double perimeter = Math.PI * Math.PI * getRadius();
        return perimeter;
    }

    public int compareTo(Circle o) 
    {
       if(radius < o.radius)
       {
           return -1;
       }
       else if(radius > o.radius)
       {
           return 1;
       }
       else
       {
           return 0;
       }
       
    }
    public boolean equals(Circle c)
    {
        if(c instanceof Circle)
        {
            Circle otherCircle = (Circle)c;
            return radius == otherCircle.getRadius();
        }
        return false;
    }

}
