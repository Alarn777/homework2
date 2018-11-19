package homework2.Inheritance.Motorcycle;

import java.awt.*;

public class Bycicle
{
    private double weight;
    private Color color;
    private String brand;
    public Bycicle(String brandVal, Color colorVal, double weightVal)
    {
        super();
        this.brand = brandVal;
        this.color = colorVal;
        this.weight = weightVal;
    }
    public Color getColor()
    {
        return color;
    }
    public void setColor(Color colorVal)
    {
        this.color = colorVal;
    }
    public double getWeight()
    {
        return weight;
    }
    public String getBrand()
    {
        return brand;
    }
    public String toString()
    {
        return "[wight="+weight+":color="+color+":brand="+brand+"]";
    }
}