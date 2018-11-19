package homework2.Inheritance.SortingHelloableObjects;


public class Person1 implements Helloable,Comparable{
    int _height;

    public Person1(int _height){
        this._height = _height;
    }
    public int get_height(){ return _height;}

    public int compareTo(Object other)
    {
        Person1 temp = (Person1) other;
        if (this.get_height() > temp.get_height())
            return 1;
        if (this.get_height() < temp.get_height())
            return -1;
        else
            return 0;
    }


    public void sayGoodMorning(){

    }

    public void sayGoodEvening(){

    }




}

interface Helloable{


    abstract public void sayGoodMorning();
    abstract public void sayGoodEvening();


}