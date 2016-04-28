
package defineclass;


class Circle
{
// create radius variable
    double radius = 1.0;

//contruct a circle object - default constructor
    Circle()
    {

    }

//construct a circle object - defined constructor
    Circle(double newRadius)
    {
        radius = newRadius;
    }

//return area of this circle
    double getArea()
    {
        return radius * radius * Math.PI;
    }

//return perimeter of this circle
    double getPerimeter()
    {
        return 2 * radius * Math.PI;
    }

//set new radius for this circle
    double setRadius(double newRadius)
    {
        return radius = newRadius;
    }
}