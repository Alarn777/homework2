package homework2.Inheritance.romanticDate;

public class RomanticDate extends Meeting
{
    private int romanticLevel;
    public static int LOW_ROMANCE = 1;
    public static int MEDIUM_ROMANCE = 5;
    public static int HIGH_ROMANCE = 10;
    public RomanticDate(String locationVal, Person[] participantsVal,
                        int romanticLevelVal)
    {
        super(locationVal,participantsVal);
        this.romanticLevel = romanticLevelVal;
    }
    public String toString()
    {
        return super.toString()+" \nromantic level = "+romanticLevel;
    }
}