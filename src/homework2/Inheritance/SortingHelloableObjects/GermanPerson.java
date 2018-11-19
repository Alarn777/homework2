package homework2.Inheritance.SortingHelloableObjects;

public class GermanPerson extends Person1 implements Helloable {
    String goodMorning = "guten Morgen";
    String goodEvning = "guten Abend";



    public GermanPerson(int _height) {
        super(_height);

    }

    @Override
    public void sayGoodMorning() {
        System.out.println(goodMorning + " ");
    }

    @Override
    public void sayGoodEvening() {
        System.out.println(goodEvning + " ");
    }
}
