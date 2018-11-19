package homework2.Inheritance.CalorieSorting;

public class Hamburger extends Food{
    Hamburger(long cal) {
        super(cal);
    }

    @Override
    public String toString() {
        return "Hamburger" + getCalories();
    }
}
