package week7;

public class EdinaSwimmingPool {
    public static void main(String[] args) {

        // another example of using the Pool object class
        Pool edina = new Pool("Edina", 50); // name holds Edina, length holds 50

        double distance = edina.distanceForLaps(12); //distanceForLaps calculates length of pool with parameter 12 laps
        // prints the toString method from the Pool class
        System.out.println(edina);
        // prints total distance swam
        System.out.println("Total distance swam swimming 12 laps is " + distance + " meters");




    }
}
