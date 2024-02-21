package week4;

import java.util.*;

import static input.InputUtils.stringInput;
import static input.InputUtils.yesNoInput;

public class GuestList {
    public static void main(String[] args) {

        // this program asks the user to enter names for a guest list,
        // then displays the guest list

        // creates an empty list
        List<String> nameList = new ArrayList<>();

        // while loop that will for a new guest name to be entered
        while (true) {
            // input prompt
            String names = stringInput("Enter the name of your guest \nPress enter when you're done");

            // if the length of the input the user entered is 0
            if (names.length() == 0) {
                // break out of this while loop
                break;
            }
            // this will check if there are repetitive names in the list after the user enters a name
            if (nameList.contains(names)) {
                // if the name is in the list it will tell the user and not add that name in the list again
                System.out.println("This name already exists");

            // if everything is working like it should
            } else {
                // this adds the name entered into the list
                nameList.add(names);
                // this will sort the list in alphabetical order
                Collections.sort(nameList);
            }
        }

        // tells user the guests
        System.out.println("Your guests are: ");

        // enhanced for loop that will be able to print each individual name on the list
        for (String name: nameList) {
            // prints the names
            System.out.println(name);
        }

        boolean removeQuestion = yesNoInput("Would you like to remove any names in your guest list?");
        if (removeQuestion) {
            System.out.println("Press enter twice when you're done deleting names.");
            while (true) {
                String removeName = stringInput("Enter the name you'd like to take off the list:");

                if (removeName.length() == 0) {
                    // break out of this while loop
                    break;

                } else {

                    nameList.remove(removeName);
                    System.out.printf("%s has been removed", removeName);
                    Collections.sort(nameList);
                }

            }
            System.out.println("Your guests are: ");

            for (String names : nameList) {

                System.out.println(names);

            }

            System.out.println("You have " + nameList.size() + "guest.");

        }

    }
}
