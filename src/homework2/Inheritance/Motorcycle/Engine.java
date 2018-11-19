package homework2.Inheritance.Motorcycle;

public class Engine
{
    private String brand;
    private double volume;
    public Engine(String brandVal, double volumeVal)
    {
        super();
        this.brand = brandVal;
        this.volume = volumeVal;
    }
    public String getBrand()
    {
        return brand;
    }
    public double getVolume()
    {
        return volume;
    }
    public String toString()
    {
        return "[brand="+brand+":volume="+volume+"]";
    }
}