package homework2;
import homework2.Inheritance.romanticDate.*;
import homework2.Inheritance.Motorcycle.*;
import homework2.Inheritance.GreatPoint.*;
import homework2.Inheritance.Shape.*;
import homework2.Inheritance.CalorieSorting.*;
import homework2.Inheritance.SortingHelloableObjects.*;
import homework2.InnerClasses.AdditionalMembers.*;
import homework2.InnerClasses.PrivateMembersAccess.*;
public class Main {
    public static void main(String[] args){
        RomanticCheckRun();

        MotorcycleDemoRun();


        PointDemoRun();


        ShapeRun();

        RestaurantRun();

        SortingHelloableObjectsRun();


        ReflectionDemoRun();

        PrivateMembersAccessRun();
    }

    private static void PrivateMembersAccessRun() {
        ClassOne temp = new ClassOne();
        temp.test();


        ClassTwo.InsideClass temp1 = new ClassTwo().new InsideClass(1);
        temp1.test();
    }

    private static void ReflectionDemoRun() {
        ReflectionDemo temp = new ReflectionDemo();
        String arg[] = new String[1];
        arg[0] = "MyClass";
        temp.test(arg);
    }

    private static void SortingHelloableObjectsRun() {
        Test temp = new Test();
        Test.testThis();
        System.out.println();
    }

    private static void RestaurantRun() {
        Restaurant temp = new Restaurant();
        temp.test();
        System.out.println();
    }

    private static void ShapeRun() {
        Shape vec[] = {new Circle(3), new Rectangle(4,5), new Circle(4), new Circle(8)};
        for(int index = 0; index < vec.length; index ++)
        {
            System.out.println(vec[index]);
        }
        System.out.println();
    }

    private static void PointDemoRun() {
        PointDemo temp = new PointDemo();
        temp.test();
        System.out.println();
    }

    private static void MotorcycleDemoRun() {
        MotorcycleDemo temp = new MotorcycleDemo();
        temp.test();
        System.out.println();
    }

    private static void RomanticCheckRun() {
        RomanticCheck temp = new RomanticCheck();
        temp.check();
        System.out.println();
    }


}
