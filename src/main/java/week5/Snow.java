package week5;

import java.util.HashMap;
import java.util.Map;

import static input.InputUtils.*;

public class Snow {
    public static void main(String[] args) {

        // this program keeps track of how much snow fell in each month
        // using hashmaps
        // this creates a new hashmap
        Map<String, Double> snowfall = new HashMap<>();
        // adding months with double data values
        snowfall.put("January", 3.1);
        snowfall.put("February", 10.0);
        snowfall.put("December", 3.1);
        snowfall.put("March", 4.1);
        snowfall.put("April", 0.0);
        // enhanced for loop that prints each month in the hashmap with its value
        // to be able to use a for loop with a dictionary the keySet() method
        // needs to be added at the end of snowfall

        for (String month: snowfall.keySet()){
            // this will get the month from the hashmap and assign the value to the snow variable
            double snow = snowfall.get(month);
            // formatted print statement
            System.out.printf("The snow in %s was %.2f inches\n", month, snow);
        }

        // adding February's snowfall to the hashmap
        snowfall.put("February", 12.4);
        // gets januarys snow fall and displays
        System.out.println("The snow in January is " + snowfall.get("January") + " inches");
        // gets julys snow fall and displays
        System.out.println("The snow in July is " + snowfall.get("July") + " inches");
        // if statement for July snow
        // if snowfall has the key July
        if (snowfall.containsKey("July")) {
            // displays there was snow
            System.out.println("There was snow in July!");
        } else {
            // if not...displays this
            System.out.println("There was no snow in July");
        }
        //user input asks user to add a month and snow in inches
        String newMonth = stringInput("Enter name of month");
        double newSnow = positiveDoubleInput("Enter amount of snow for " + newMonth);

        // if a month the user entered already exists
        if (snowfall.containsKey(newMonth)) {
            // ask if should overwrite?
            double snow = snowfall.get(newMonth);
            // lets user know the month and snow value exists
            System.out.println("The hashmap already contains that month, " + newMonth + " snow = " + snow + " inches");
            // asks if should overwrite
            boolean overwrite = yesNoInput("Overwrite data?");
            // if yes
            if (overwrite) {
                // the key value is overwritten
                snowfall.put(newMonth, newSnow);
            } else {
                // if no, nothing is overwritten
                System.out.println("Data was not added.");
            }
        } else {
            // if the month user entered isn't in the hashmap already, add it to the hashmap
            snowfall.put(newMonth, newSnow);
        }

        System.out.println(snowfall);

        // adds all the key values in the hash map together
        double total = 0;
        for (double snow : snowfall.values()) {
            total += snow;
        }
        // displays the total
        System.out.println("The total snow is " + total);

    }
}
