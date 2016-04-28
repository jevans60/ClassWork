
package hw15.pkg2ec;

import java.util.Date;

public abstract class GeometricObject 
{
     private Date dateCreated;
    
    protected GeometricObject()
    {
        dateCreated = new Date();
    }
    
    public abstract double getArea();
}


