package homework2.InnerClasses.AdditionalMembers;

public class MyClass {
    int number;
    String name;
    double date;

    public MyClass(int number, String name, double date) {
        this.number = number;
        this.name = name;
        this.date = date;
    }

    public MyClass(){};

    @Override
    public String toString() {
        return "MyClass{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(double date) {
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getDate() {
        return date;
    }

    public MyClass(String name) {
        this.name = name;
    }


}
