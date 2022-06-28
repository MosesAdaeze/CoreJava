package WildCard;

import java.util.Arrays;
import java.util.List;

public class UpperBoundWIldCard {
    public static void main(String[] args) {
        //upper Bounded integer list
        List< Integer > intList = Arrays.asList(10,20,30,40);
        //printing the sun of integer elements in list
        System.out.println("Total sun is:" + sum(intList));

        //upper Bounded Double List
        List < Double > doubleList = Arrays.asList(13.2, 15.6, 9.7, 22.5);
        //printing the sum of double elements in list
        System.out.println("Total sum is: " + sum(doubleList));
    }

    private static double sum(List < ?extends Number > mylist) {
        double sum = 0.0;
        for (Number iterator: mylist) {
            sum = sum + iterator.doubleValue();
        }
        return sum;
    }
}
