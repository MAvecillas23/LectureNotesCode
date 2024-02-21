package week4;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        //This is how you create a list
        List<String> arrayList = new ArrayList<>();
        // this is how you add things to a list
        arrayList.add("Hello");
        arrayList.add("World!");
        arrayList.add("Michael");
        arrayList.add("MCTC");


        // this is how you print the contents of an arrayList using
        // a for loop
        for (String s: arrayList) {
            System.out.println(s);
            System.out.println(s.toUpperCase());
            System.out.println(s.length());
        }

    }
}
