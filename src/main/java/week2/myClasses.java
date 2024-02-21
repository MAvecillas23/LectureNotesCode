package week2;

import java.util.Arrays;

import static input.InputUtils.intInput;
import static input.InputUtils.stringInput;

public class myClasses {
    public static void main(String[] args) {

        int numOfClasses = intInput("How many classes do you have?");

        String[] classes = new String[numOfClasses];

        for (int x = 0; x < numOfClasses; x++) {
            String ask = stringInput("Enter a class:");
            classes[x] = ask;

        }
        System.out.println("Your classes are: ");
        for (int x = 0; x < numOfClasses; x++) {
            System.out.println(classes[x]);
        }
    }
}
