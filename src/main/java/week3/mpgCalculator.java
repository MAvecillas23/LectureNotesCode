package week3;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class mpgCalculator {
    public static void main(String[] args) {

        // this program will calculate mpg using miles and gallons
        // using the mpg method
        // asks user how many miles are driven
        double miles = doubleInput("Enter the number of miles driven");
        // asks user how many gallons used
        double gallons = doubleInput("How many gallons of gas used");

        // sends miles and gallons to the mpg method
        double mpg = mpg(miles, gallons);

        // displays the mpg
        System.out.printf("Your total miles per gallon is %.2f", mpg);
    }

    public static double mpg(double miles, double gallons) {
        // this method calculates the miles per gallon by dividing miles and gallons
        double mpg = miles / gallons;
        // returns mpg to main
        return mpg;
    }
}
