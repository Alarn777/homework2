package homework2.Inheritance.GreatPoint;

class MyPoint
{
    double x;
    double y;
    MyPoint()
    {
    }
    MyPoint(double a, double b)
    {
        x=a;
        y=b;
    }
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    public void setX(double xVal)
    {
        x = xVal;
    }
    public void setY(double yVal)
    {
        y = yVal;
    }
}
