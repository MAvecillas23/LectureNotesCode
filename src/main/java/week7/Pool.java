package week7;

public class Pool {
// variables belonging to a class are called instance variables
    private String name; // field or a variable
    private double length; // another field


    public Pool(String name, double length) { // this block of code is how you create a constructor

        this.name = name;    // name and length being the variables that hold data in another program
        this.length = length;
    }

    public double distanceForLaps(int laps) {
        // methods belonging to classes are called instance methods
                                            // creating methods in a class can be used for
                                            // what you want this object method to do in another program
                                            // in this case this method will calculate what data length holds and
                                            // whatever parameter user enters in the other program

        // 10 laps of a pool length 50 that's 500 meters
        double total = laps * this.length;
        // total is returned to user
        return total;
    }

    @Override // toString is already a method of its own using @Override tells java that we prefer to use this toString
    // method to create our own different method
    // when the object name is printed
    // this is how it will be displayed to the user
    public String toString() {
        String description = this.name + " pool is " + length + " meters long.";
        return description;
    }

    // generated getter/ setter code using alt + insert keys and pressing getter and setter to generate code
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
