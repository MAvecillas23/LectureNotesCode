package week4;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.stringInput;

public class userInputAndLists {
    public static void main(String[] args) {
        // this program asks the to enter things that needs to be done
        // and creates a to do list
        List<String> todoList = new ArrayList<>();

        while (true) {
            String data = stringInput("Please type a task you need to do, or press Enter to quit");
            if (data.length() == 0) { // If the user just presses Enter, the length of text is 0.
                break;
            }
            if (todoList.contains(data)){
                System.out.println("You already have this task in your to do list!");

            } else{
                todoList.add(data);
            }

        }

        System.out.println("Thank you, your tasks are:");

        for (String input: todoList) {
            System.out.println(input);
        }
        System.out.printf("You have %d tasks do to.", todoList.size());
    }
}
