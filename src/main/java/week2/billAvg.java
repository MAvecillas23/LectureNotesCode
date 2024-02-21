package week2;

import static input.InputUtils.doubleInput;

public class billAvg {
    public static void main(String[] args) {
        // This program calculates the average of last years heating bill

        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        double[] cost = new double[12];
        double costTotal = 0.0;

        for (int x = 0; x < months.length; x++) {

            double total = doubleInput("What is the cost for the month of " + months[x]);
            cost[x] = total;
            costTotal = costTotal + cost[x];
        }

        double costAvg = costTotal / months.length;
        System.out.printf("Your average estimate for this years bill is $%.2f", costAvg);
    }
}
