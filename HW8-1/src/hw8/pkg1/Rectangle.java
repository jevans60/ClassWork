
package hw8.pkg1;

class Rectangle
{
    double width = 1.0;
    double height = 1.0;
   
    Rectangle()
    {
    }
    
    Rectangle(double newWidth, double newHeight)
        {
            width = newWidth;
            height = newHeight;
        }
    
    double getArea()
        {
            return (width * height);
        }
    
    double getPerimeter()
        {
            return (width + width + height + height);
        }
    
    double setWidth(double newWidth)
        {
        return width = newWidth;
        }
    
    void setHeight(double newHeight)
        {
         height = newHeight;
        }
    
    
}
