package week4;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.positiveDoubleInput;

public class CountIncidences {
    public static void main(String[] args) {
        // more examples of using lists and loop and inputs
        // creates an array list named speeds
        List<Double> speeds = new ArrayList<>();

        int totalHours = 12; // total hours is 12
        // for loop that will loop 12 times that asks user to enter the internet speed to its respective hour
        for (int hour = 0; hour < totalHours; hour++) {
            // enters speed
            double speed = positiveDoubleInput("Enter the internet speed for hour " + hour);
            // speed is added to the list
            speeds.add(speed);

        }
        // tells user the speeds
        System.out.println("All the speeds are: ");

        // for loop that loops each index in the speeds list
        for (int hour = 0; hour < speeds.size(); hour++) {
            // gets the speed in the index being looped and assigns it to variable speed
            double speed = speeds.get(hour);
            // displays the speed with its respective hour
            System.out.printf("Hour: %d Speed %.2f\n", hour, speed);
        }
        // zeroCount is 0 for now
        int zeroCount = 0;

        // for each loop that loops through the speeds list
        for (double speed : speeds) {
            // if the index being looped is equal to 0
            if (speed == 0) {
                // zeroCount is added by 1
                zeroCount++;
            }
        }
        // while loop that removes all speeds that have 0.0 in the list
        while (speeds.contains(0.0)) {
            speeds.remove(0.0);
        }
        // displays the list
        System.out.println(speeds);

        // total is 0 for now
        double total = 0;
        // for loop that adds all the indexes together
        for (double speed: speeds) {
            total = total + speed;

        }
        // gets the average of the speeds total
        double average = total / speeds.size();

        // displays the average
        System.out.println("The average speed is " + average);
    }
}
