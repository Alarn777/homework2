package homework2.Inheritance.Motorcycle;

import java.awt.*;

public class MotorcycleDemo
{
    public void test()
    {
        Motorcycle motorcycle = new Motorcycle("Honda",Color.black,2000,new Engine("Suzuki",1000));
        System.out.println(motorcycle);
    }
}