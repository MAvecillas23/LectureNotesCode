package week3;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class mpgCalculator {
    public static void main(String[] args) {

        // this program will calculate mpg using miles and gallons
        // using the mpg method
        double miles = doubleInput("Enter the number of miles driven");
        double gallons = doubleInput("How many gallons of gas used");

        double mpg = mpg(miles, gallons);
        System.out.printf("Your total miles per gallon is %.2f", mpg);
    }

    public static double mpg(double miles, double gallons) {
        double mpg = miles / gallons;
        return mpg;
    }
}
