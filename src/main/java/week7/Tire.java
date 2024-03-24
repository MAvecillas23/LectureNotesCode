package week7;

public class Tire implements Comparable<Tire> {
    // Tire class for the TireComparison program

    private String name; // field that holds tire name
    private double price; // field that holds tire price
    private int warrantyMiles; // field that holds the stated warranty miles

    // constructor
    public Tire(String name, double price, int warrantyMiles) {
        this.name = name;
        this.price = price;
        this.warrantyMiles = warrantyMiles;
    }

    // calculates the price for every 1000 miles
    // returns the price
    public double pricePer1000Miles(){
        double pricePer1000 = (this.price / warrantyMiles) * 1000;
        return pricePer1000;
    }

    // multiplies the price of one tire by 4 (4 tires) and returns that
    public double costForSet() {
        return this.price * 4;
    }

    // overrides toString method to have a formatted description to show user
    @Override
    public String toString() {
        double pricePer1000 = pricePer1000Miles();
        return String.format("%s costs $%.2f per tire. Cost per 1000 miles is $%.2f.", this.name, this.price, pricePer1000);


    }

    // compares price of one tire object to another
    @Override
    public int compareTo(Tire anotherTire) {

        return Double.compare(pricePer1000Miles(), anotherTire.pricePer1000Miles());

    }


}
