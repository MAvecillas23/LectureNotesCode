package week4;

import java.util.Random;

public class randomMethodReview {
    public static void main(String[] args) {

        // creates a random generator
        Random rnd = new Random();

        // gets a random number between 0 and 9
        int randomNumber = rnd.nextInt(10);
        // gets a random number between 0 and 10... + 1 at the end of this statement
        // is how you avoid 0 and 9
        int randomNumberBetween1and10 = rnd.nextInt(10) + 1;
        System.out.println(randomNumber + " " + randomNumberBetween1and10);

    }
}
