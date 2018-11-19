package homework2.Inheritance.CalorieSorting;

import java.util.*;


public class Restaurant
{
    public void test()
    {
        Food vec[] = new Food[10];
        for(int index=0; index<vec.length; index++)
        {
            int i = (int) (Math.random()*10)%3;
            switch (i){
                case 1:
                    vec[index] = new Hamburger(300);
                    break;
                case 2:
                    vec[index] = new Pizza(100);
                    break;
                case 3:
                    vec[index] = new Flafel(10);
                    break;
                default:
                    vec[index] = new Flafel(10);
                    break;
            }


        }

        Arrays.sort(vec);

        for (Food aVec : vec) {
            System.out.println(aVec);
        }
    }
}