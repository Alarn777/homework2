package homework2.Inheritance.Shape;

public class Rectangle extends Shape{
    private double _height,_width;

    public Rectangle(double height, double width){
        _height = height;
        _width = width;
    }
    Rectangle(){
        _height = 0;
        _width = 0;
    }


    @Override
    public double area() {
        return  this._width * this._width;
    }
}
