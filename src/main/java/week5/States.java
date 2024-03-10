package week5;

import java.util.HashMap;
import java.util.Map;

public class States {
    public static void main(String[] args) {

        // example of hashmaps... like python they're basically dictionaries
        HashMap<String, String> stateAbbreviations =  new HashMap<>();
        // put() method adds values to the hashmap
        stateAbbreviations.put("Minnesota", "MN");
        stateAbbreviations.put("Wisconsin", "WI");
        stateAbbreviations.put("Michigan", "MI");
        //stateAbbreviations.put("Iowa", "IA");
        // you can print hashmaps
        System.out.println(stateAbbreviations);
        // using the get() method you can pull a value from the hashmap
        System.out.println(stateAbbreviations.get("Minnesota"));
        // printing a value that doesn't exist in hashmap returns null
        System.out.println(stateAbbreviations.get("Iowa"));

        // pulling data from a hashmap and assigning a variable to it
        String wisconsinAbbreviation = stateAbbreviations.get("Wisconsin");
        System.out.println(wisconsinAbbreviation);

        // looping through the stateAbbreviations hashmap using the keySet() method
        // keySet() loops through the keys in the hashmap
        for (String stateName : stateAbbreviations.keySet()) {
            System.out.println(stateName);
            System.out.println(stateAbbreviations.get(stateName));
        }

        // looping through stateAbbreviations hashmap using the values() method
        // values() loops through the values in the hashmap
        for (String abbreviation : stateAbbreviations.values()) {
            System.out.println(abbreviation);
        }

        // this block of code searches for the value "MI" in the stateAbbreviations hashmap
        String searchAbbreviation = "MI";
        // loops through each key in the hashmap
        for (String stateName : stateAbbreviations.keySet()) {
            System.out.println(stateName);
            // for each loop the value that it's looped on is assigned to abbreviation variable
            String abbreviation = stateAbbreviations.get(stateName);
            // if statement that checks if the assigned abbreviation matches the search abbreviation
            if (abbreviation.equals(searchAbbreviation)) {
                // tells uer the abbreviation was found in the hashmap
                System.out.println("Found it! The state for " + searchAbbreviation + " is " + stateName);
            }
        }

        // this block of code is one way to make stateAbbreviations keys the values, and the values the keys
        // (reversed)
        // an example of looping over sets of key-value pairs
        // using the line of code inside the for statement
        Map<String, String> abbreviationStateNames = new HashMap<>();
        for (Map.Entry<String, String> entry : stateAbbreviations.entrySet()) {
            String state = entry.getKey();
            String abbreviation = entry.getValue();
            abbreviationStateNames.put(abbreviation, state);
        }
        System.out.println(abbreviationStateNames);
        System.out.println(stateAbbreviations);

        // example of how to get the number of key-value pairs in a hashmap
        // number of state-state abbreviations in the hashmap
        System.out.printf("There are %d states listed", stateAbbreviations.size());
    }
}
