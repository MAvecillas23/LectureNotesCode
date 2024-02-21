package week3;

import static input.InputUtils.intInput;

public class creditsToGraduate {
    public static void main(String[] args) {
        /* this program calculates how many credits the user
        needs to graduate in his program  */

        int creditsEarned = intInput("How many credits do you currently have?");
        int creditsNeeded = intInput("How many credits do you need to graduate?");
        int creditsCalculated = howManyCreditsToGraduate(creditsEarned, creditsNeeded);

        System.out.printf("You currently need %d credits in order to graduate", creditsCalculated);
    }

    public static int howManyCreditsToGraduate(int earned, int needed) {
        int calculated = needed - earned;
        return calculated;
    }
}
