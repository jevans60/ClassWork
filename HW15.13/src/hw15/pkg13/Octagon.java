
package hw15.pkg13;

public class Octagon extends GeometricObject implements Cloneable, 
        Comparable <Octagon>
{
    private double area;
    private double side;
    private double perimeter;
    
    public Octagon(double side)
    {
        setSide(side);
    }
    
    public double getSide()
    {
        return side;
    }
    
    public void setSide(double side)
    {
        if(side >= 0)
        {
        this.side = side;
        }
        else
        {
            this.side = 0;
        }
    }
    
    @Override
    public double getArea() 
    {
        area = (2 + 4/Math.sqrt(2) * side * side);
        return area;
    }
    
    
    public double getPerimeter()
    {
        perimeter = side + side + side + side + side + side + side + side;
        return perimeter;
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    
    @Override
    public int compareTo(Octagon o)
    {
        if (side > o.side)
        {
            return 1;
        }
        else if (side < o.side)
        {
         return -1;
        }
         else
        {
        return 0;
        }
    }
    
    public boolean equals(Octagon c)
    {
        if(c instanceof Octagon)
        {
            Octagon otherCircle = (Octagon)c;
            return side == otherCircle.getSide();
        }
        return false;
    }

}
