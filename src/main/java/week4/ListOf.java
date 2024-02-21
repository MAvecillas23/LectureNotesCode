package week4;

import java.util.List;

public class ListOf {
    public static void main(String[] args) {
        // another way of creating lists...
        // this allows to add all objects to a list without constantly
        //having to type out the add() method
        // downside is you're restricted from adding
        // or removing anything else to this list
        List<String> animals = List.of("Cat", "Bird", "Zebra");
        System.out.println(animals);
    }
}
