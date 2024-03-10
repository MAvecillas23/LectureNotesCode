package week5;

import java.util.HashMap;
import java.util.Map;

public class ClassCodes {
    public static void main(String[] args) {
        // this program creates a hashmap with class codes and class names and prints them using a loop

        // creates a new hashmap
        Map<Integer, String> classes = new HashMap<>();

        // adding data to the hashmap
        classes.put(2545, "Java");
        classes.put(1425, "DataCom");
        classes.put(2560, "Web");

        //displays the raw hashmap
        System.out.println(classes);

        // using a for loop to print each key value set in a newline
        for (int c : classes.keySet()) {
            System.out.printf("ITEC %d %s \n", c, classes.get(c));
        }

        // gets the number of key value sets in the classes hashmap
        System.out.printf("You are taking %d classes!\n", classes.size());

        // this block of code will check if the 2417 searchCode matches with any keys in the hashmap
        int searchCode = 2417;
        // using the containsKey() method to check
        if (classes.containsKey(searchCode)) {
            // if searchCode is found this is displayed
            System.out.printf("Found it! Class code %d is %s", searchCode, classes.get(searchCode));
        } else {
            // if not found this is displayed
            System.out.println(searchCode + " Not found");
        }

        // block of code that checks if the 2545 searchCode is in the classes hashmap
        int searchCode2 = 2545;
        // using the containsKey() method
        if (classes.containsKey(searchCode2)) {
            // if found this is displayed
            System.out.printf("Found it! Class code %d is %s!", searchCode2, classes.get(searchCode2));
        } else {
            // if not found this is displayed
            System.out.println(searchCode2 + " Not found");
        }



    }
}

