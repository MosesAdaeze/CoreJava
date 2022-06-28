package WildCard;

import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildcard {
    public static void main(String[] args) {
        //lower Bounded Integer List
        List < Integer > intList = Arrays.asList(10,20,30,40);
        //passing integer list object
        printOnlyIntegerClassorSuperClass(intList);

        //Number list
        List < Number > numberList = Arrays.asList(10,20,30,40);
        //Passing Integer list object
        printOnlyIntegerClassorSuperClass(numberList);
    }
    public static void printOnlyIntegerClassorSuperClass(List < ?super Integer > List) {
        System.out.println(List);
    }
}
