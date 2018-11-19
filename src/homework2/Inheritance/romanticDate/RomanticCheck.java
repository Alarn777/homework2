package homework2.Inheritance.romanticDate;

public class RomanticCheck{

    public void check()
    {
        Person man = new Person(123123,"John");
        Person woman = new Person(453234,"Dana");
        Person vec[] = new Person[2];
        vec[0] = man;
        vec[1] = woman;
        String place = "Tel-Aviv";
        RomanticDate date = new RomanticDate(place,vec,RomanticDate.HIGH_ROMANCE);
        System.out.println(date);
    }
}
