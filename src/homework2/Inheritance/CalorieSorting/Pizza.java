package homework2.Inheritance.CalorieSorting;

public class Pizza extends Food {

    Pizza(long cal) {
        super(cal);
    }

    @Override
    public String toString() {
        return "Pizza " + getCalories();
    }
}
