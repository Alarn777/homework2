package homework2.Inheritance.CalorieSorting;

public class Flafel extends Food{
    Flafel(long cal) {
        super(cal);
    }

    @Override
    public String toString() {
        return "Flafel " + getCalories();
    }
}
