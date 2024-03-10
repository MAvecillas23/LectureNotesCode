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

        // asks user if they want to remove names with a yes no answer
        boolean removeQuestion = yesNoInput("Would you like to remove any names in your guest list?");
        if (removeQuestion) { // if user enters yes
            // tells user to enter the name to delete
            System.out.println("Press enter twice when you're done deleting names.");
            while (true) {
                String removeName = stringInput("Enter the name you'd like to take off the list:");
                // when user presses enter twice they are taken out of the remove name loop
                if (removeName.length() == 0) {
                    // break out of this while loop
                    break;

                } else {
                    // if not entered twice loop will continue to delete names entered
                    nameList.remove(removeName);
                    System.out.printf("%s has been removed \n", removeName);
                    Collections.sort(nameList);
                }

            }
            System.out.println("Your guests are: ");
            // for loop that will loop each name in the names list
            for (String names : nameList) {
                // prints names
                System.out.println(names);

            }
            // gets the number of names in the names list
            System.out.println("You have " + nameList.size() + " guests.");

        }

    }
}
