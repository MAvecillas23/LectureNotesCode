package week2;

import static input.InputUtils.doubleInput;

public class busExpenseCalculator {
    public static void main(String[] args) {
        // this program finds the total amount of bus fare spent every week
        double spent = 0.0;
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (int x = 0; x < days.length; x++) {
            String dayName = days[x];
            double busFare = doubleInput("On " + dayName +
                    " what did you spend on bus fares?");
            spent += busFare;
        }
        System.out.println("For the week you spent " + "$" + spent);

        // this is the formatted version of printing
        System.out.printf("For the week you spent $%.2f", spent);

    }


}
