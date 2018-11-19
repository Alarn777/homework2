package homework2.Inheritance.GreatPoint;

import java.awt.*;
import java.math.*;
public class GreatPoint extends MyPoint {
    GreatPoint(double x,double y){
    super(x,y);
    }
    public double distance(){
        return Math.sqrt((y*y)+(x*x));

    }
}
