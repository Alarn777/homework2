package homework2.Inheritance.Shape;

public class Circle extends Shape {
    private static double Pi = 3.14;
    private double radius,pointX,pointY;

    public Circle(double radius) {
        this.radius = radius;
        pointX = 0;
        pointY = 0;
    }

    @Override
    public double area() {
        return  Pi* this.radius* this.radius;
    }
}
