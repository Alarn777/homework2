package homework2.Inheritance.SortingHelloableObjects;

import java.util.Arrays;

public class Test {
    public static void testThis(){
        Person1 vec[] = new Person1[5];
        for(int index=0; index<vec.length; index++) {
            int i = (int) (Math.random() * 10) % 3;
            switch (i) {
                case 0:
                    vec[index] = new FrenchPerson(179);
                    break;
                case 1:
                    vec[index] = new GermanPerson(165);
                    break;
                case 2:
                    vec[index] = new EnglishPerson(189);
                    break;
                default:
                    vec[index] = new GermanPerson(165);
                    break;
            }
        }
//        vec[1].compareTo(vec[2]);

        Arrays.sort(vec);
        for (Person1 tempPerson: vec
        ) {
            tempPerson.sayGoodMorning();
            tempPerson.sayGoodEvening();
        }

    }
}
