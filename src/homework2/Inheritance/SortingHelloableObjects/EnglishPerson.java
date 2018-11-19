package homework2.Inheritance.SortingHelloableObjects;

public class EnglishPerson extends Person1 implements Helloable{
    String goodMorning = "Good morning";
    String goodEvning = "Good evening";




    public EnglishPerson(int _height) {
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
