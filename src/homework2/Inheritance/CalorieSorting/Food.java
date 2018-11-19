package homework2.Inheritance.CalorieSorting;

class Food implements Comparable
{
    private long calories;
    Food(long cal)
    {
        calories = cal;
    }
    long getCalories()
    {
        return calories;
    }
    public int compareTo(Object other)
    {
        Food temp = (Food) other;
        if (this.getCalories() > temp.getCalories())
            return 1;
        if (this.getCalories() < temp.getCalories())
            return -1;
        else
            return 0;
    }




    public String toString()
    {
        return "calories= "+calories;
    }
}