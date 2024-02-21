package week2;

import static input.InputUtils.intInput;
import java.util.Random;

public class secretNumber {
    public static void main(String[] args) {
        // this program asks the user to guess the number the program is thinking of.

        Random random = new Random();
        int secretNumber = random.nextInt(10);
        int guess = intInput("Guess the number i'm thinking of between 1 and 10!");

        while (guess != secretNumber)
        {
            if (guess < secretNumber)
            {
                System.out.println("Guess Higher!");
            }

            else if (guess > secretNumber)
            {
                System.out.println("Guess Lower!");
            }

            System.out.println("That's not it!");
            guess = intInput("Guess again: ");
        }

        System.out.printf("You got it! It was %d.", secretNumber);
    }
}
