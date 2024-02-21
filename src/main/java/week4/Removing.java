package week4;

import java.util.ArrayList;
import java.util.List;

public class Removing {
    public static void main(String[] args) {
        // examples of adding, removing, setting etc...
        // creates the list
        List<String> classNames = new ArrayList<>();
        // adds objects to the list
        classNames.add("Programming Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info Tech Concepts");

        System.out.println(classNames);

        // removes String Project Management from the list
        classNames.remove("Project Management"); // object
        System.out.println(classNames);

        // removes whatever object is in index 0 of the list
        classNames.remove(0);  // int primitive type - index primitive int type
        System.out.println(classNames);

        // set() replaces whatever is in index 1 stated with
        // the String Systems Analysis...
        // this replaces the previous object it does not move it down the list like
        // add() does
        classNames.set(1, "Systems Analysis");
        System.out.println(classNames);

        // String variable called search
        String search = "C# Programming";

        // if statement that will check if a string mentioned is in the list
        // contains() is what allows the program to look for a String in the list
        if (classNames.contains(search)) {
            System.out.println("The list does contain " + search);
        } else {
            System.out.println("The list does NOT contain " + search);
        }

        System.out.println(classNames.size());

        // clear() clears everything in the list and returns an empty list
        classNames.clear();
        System.out.println(classNames);


    }
}
