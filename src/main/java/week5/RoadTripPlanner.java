package week5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static input.InputUtils.positiveIntInput;

public class RoadTripPlanner {
    public static void main(String[] args) {
        /*
        This program asks user to enter a max radius they want to drive and prints
        cities that are within that range
         */

        // Creates a hashmap and adds the cities and their distances
        Map<String, Integer> distances = new HashMap<>();
        distances.put("Duluth", 154);
        distances.put("Brainerd", 127);
        distances.put("Stillwater", 26);
        distances.put("Ely", 245);
        distances.put("Red Wing", 54);

        // asks user to enter a max radius
        int maxDistance = positiveIntInput("Enter the maximum distance you want to drive for your roadtrip: ");

        // new list where the cities within range will go into
        List<String> citiesWithinRadius = new ArrayList<>();

        // for loop that loops through the hashmap
        for (String check : distances.keySet()) {
            // if the key-value that is being looped is less than the max radius entered
            if (distances.get(check) <= maxDistance) {
                // city is added to citiesWithinRadius list
                citiesWithinRadius.add(check);
            }
        }

        // if no cities within the entered radius are found/ if the list is empty
        if (citiesWithinRadius.isEmpty()) {
            // informs the user no cities were found
            System.out.println("Sorry, there are no cities within a " + maxDistance + " mile radius.");
        } else {
            // else prints the cities in a newline using a for loop
            System.out.println("The cities you can drive to are: ");
            for (String cities : citiesWithinRadius) {
                System.out.println(cities);
            }
        }



    }
}
