package homework2.InnerClasses.AdditionalMembers;

public class MyClassSon extends MyClass{
    int sonCount;
    String sonName;

    public MyClassSon(int number, String name, double date, int sonCount, String sonName) {
        super(number, name, date);
        this.sonCount = sonCount;
        this.sonName = sonName;
    }

    public MyClassSon(int sonCount, String sonName) {
        this.sonCount = sonCount;
        this.sonName = sonName;
    }

    public MyClassSon(String name, int sonCount, String sonName) {
        super(name);
        this.sonCount = sonCount;
        this.sonName = sonName;
    }

    public int getSonCount() {
        return sonCount;
    }

    public String getSonName() {
        return sonName;
    }

    @Override
    public String toString() {
        return "MyClassSon{" +
                "sonCount=" + sonCount +
                ", sonName='" + sonName + '\'' +
                ", number=" + number +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    public void setSonCount(int sonCount) {
        this.sonCount = sonCount;
    }

    public void setSonName(String sonName) {
        this.sonName = sonName;
    }
}
