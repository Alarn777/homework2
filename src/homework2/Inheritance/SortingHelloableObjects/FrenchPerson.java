package homework2.Inheritance.SortingHelloableObjects;

public class FrenchPerson extends Person1 implements Helloable{
    private String goodMorning = "Bonjour";
    private String goodEvning = "Bonsoir";




    public FrenchPerson(int height ) {
         super(height);

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

