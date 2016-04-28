
package hw15.pkg11;

import java.util.Date;

public abstract class GeometricObject
{
    private Date dateCreated;
    
    protected GeometricObject()
    {
        dateCreated = new Date();
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();
}
