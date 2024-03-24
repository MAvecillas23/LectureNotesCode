package week6;

import static input.InputUtils.intInput;

public class UserEntersData {
    public static void main(String[] args) {
        // input validation
        // user must enter a number between 1 and 10
        // program ensures user enters a number within the range

        int userInput = 0; // will be the number the user enters

        // while loop thats loops until the user enters a number between 1 and 10
        while (userInput < 1 || userInput > 10) {
            // will continue to ask user to enter number within range
            userInput = intInput("Please enter a number between 1 and 10");

        }
        // display
        System.out.printf("Thanks, the number you entered is %d", userInput);
    }
}
