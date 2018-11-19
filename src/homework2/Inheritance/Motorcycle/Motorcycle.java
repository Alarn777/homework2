package homework2.Inheritance.Motorcycle;

import java.awt.Color;

public class Motorcycle extends Bycicle
{
    private Engine engine;
    public Motorcycle(String brandVal, Color colorVal, double weightVal, Engine engineVal)
    {
        super(brandVal, colorVal, weightVal);
        this.engine = engineVal;
    }
    public Engine getEngine()
    {
        return engine;
    }
    public String toString()
    {
        return "["+engine.toString()+":"+super.toString()+"]";
    }
}