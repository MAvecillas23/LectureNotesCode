package week7;

public class SwimmingPoolProgram {
    public static void main(String[] args) {
        // using the pool class this program calculates distance swam using the Pool object

        Pool ymca = new Pool("YMCA", 50); // YMCA is held in name in the Pool class
                                                        // 50 is held in the length in the Pool class

        double totalSwam = ymca.distanceForLaps(6); // using the distanceForLaps method with 6 being the parameter
                                                    // the distance for laps is calculated in the Pool class
        // prints out the total swam
        System.out.println("The total distance is " + totalSwam);

        // another example of using the Pool object
        Pool como = new Pool("Como", 25);
        System.out.println(como.distanceForLaps(12));

        System.out.println(como);
    }
}
