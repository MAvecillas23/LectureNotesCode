package week3;

import static input.InputUtils.intInput;

public class creditsToGraduate {
    public static void main(String[] args) {
        /* this program calculates how many credits the user
        needs to graduate in his program  */

        //asks user to enter credits currently have
        int creditsEarned = intInput("How many credits do you currently have?");

        //asks user to enter credits needed to graduate
        int creditsNeeded = intInput("How many credits do you need to graduate?");

        // sends creditsEarned and creditsNeeded to howManyCreditsToGraduate method
        int creditsCalculated = howManyCreditsToGraduate(creditsEarned, creditsNeeded);

        // displays the calculated credits returned from howManyCredits method
        System.out.printf("You currently need %d credits in order to graduate", creditsCalculated);
    }

    public static int howManyCreditsToGraduate(int earned, int needed) {
        // this method subtracts credits earned and needed and returns the total back to main
        int calculated = needed - earned;
        return calculated;
    }
}
