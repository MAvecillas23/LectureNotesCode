package week7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static input.InputUtils.*;

public class TireComparison {
    // this program gets tires, their prices and compares prices with other tires
    public static void main(String[] args) {
        // creates a new tire object
        // with tire name, price for 1 tire, and the warranty miles
        Tire example = new Tire("Bridgestone", 50, 10000);
        // sends to pricerPer1000Miles() method and gets the price for every 1000 miles
        System.out.println("$" + example.pricePer1000Miles());
        // prints formatted overrided toString method
        System.out.println(example);
        // multiplies price of tire by 4 (4 tires) in a set
        System.out.println(example.costForSet());

        System.out.println();
        System.out.println();
        System.out.println();

        // tireList holds tire objects in a list
        List<Tire> tireList = new ArrayList<>();

        // asks user for tire information (sends to getTireInfo() method) and adds them to the tireList
        do {
            Tire tire = getTireInfo();
            tireList.add(tire);
            // asks user if they want to add more tires
        } while (yesNoInput("More tires to add to compare?"));

        // sorts tires in alphabetical order
        Collections.sort(tireList);
        printReportTable(tireList); // prints tire info + price of 4 tires... a set

    }

        // prints tires info and cost of tire sets
        private static void printReportTable(List<Tire> tireList) {
            for (Tire tire : tireList) {
                System.out.println(tire);
                System.out.println("The cost per set of 4 is: " + tire.costForSet());

            }
        }


        // asks user to enter name of tire, price, and warranty miles and adds that information
    // to a tire object
        private static Tire getTireInfo() {
            String name = stringInput("Enter name of tire?"); // name of tire
            double price = positiveDoubleInput("Enter price of " + name + "?"); // price of tire
            int mileWarranty = positiveIntInput("Enter number of miles warranty?"); // warranty miles

            // adds to new tire object
            Tire tire = new Tire(name, price, mileWarranty);
            // returns tire to where it was called from
            return tire;
        }
    }

