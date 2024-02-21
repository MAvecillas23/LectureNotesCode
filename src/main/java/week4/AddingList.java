package week4;

import java.util.ArrayList;
import java.util.List;

public class AddingList {
    public static void main(String[] args) {
        // examples of creating a list and adding integers to classCodes
        List<Integer> classCodes = new ArrayList<>();
        // adding numbers at the end of the list
        classCodes.add(2546);
        classCodes.add(1150);
        classCodes.add(1250);

        // adding numbers at specific indexes... when a new number is added
        //to an occupied index, the occupied index is moved down the list by one
        classCodes.add(0, 1425);
        classCodes.add(2, 110);

        // prints list
        System.out.println(classCodes);
        // gets the number of indexes in the list
        System.out.println(classCodes.size());

        // using a enhanced for loop/ foreach loop in other languages
        for (int classCode: classCodes) {
            System.out.println("ITEC " + classCode);
        }
    }
}
