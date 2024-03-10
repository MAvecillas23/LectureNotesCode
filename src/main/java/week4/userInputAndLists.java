package week4;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.stringInput;

public class userInputAndLists {
    public static void main(String[] args) {
        // this program asks the to enter things that needs to be done
        // and creates a to do list

        // creates a new list
        List<String> todoList = new ArrayList<>();

        // while loop that will continue to loop until user presses enter twice
        while (true) {
            // asks user to enter a task to do
            String data = stringInput("Please type a task you need to do, or press Enter to quit");

            if (data.length() == 0) { // If the user just presses Enter, the length of text is 0.
                // if the length of text is 0 the program breaks out of the while loop
                break;
            }
            // if task already exists in the list
            if (todoList.contains(data)){
                // lets user know
                System.out.println("You already have this task in your to do list!");

            } else{
                // if the tasks doesn't already exist, it's added to the list
                todoList.add(data);
            }

        }

        System.out.println("Thank you, your tasks are:");
        // for loop that prints each index task in a new line
        for (String input: todoList) {
            System.out.println(input);
        }
        // gets the number of indexes in the to do list using the size() method
        System.out.printf("You have %d tasks do to.", todoList.size());
    }
}
