package homework2.Inheritance.romanticDate;

public class Person
{
    private int id;
    private String name;
    public Person(int idVal, String nameVal)
    {
        super();
        this.id = idVal;
        this.name = nameVal;
    }


    public String getName()
    {
        return name;
    }
    public void setName(String nameVal)
    {
        this.name = nameVal;
    }
    public int getId()
    {
        return id;
    }
    public String toString()
    {
        return this.name+":"+this.id;
    }
}
