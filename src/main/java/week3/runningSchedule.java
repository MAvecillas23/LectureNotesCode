package week3;

public class runningSchedule {
    public static void main(String[] args) {

        // this program finds out how many weeks it would take someone
        // to run marathon distance if they increased their distance by 10% every week
        // using a while loop
        double marathonDistance = 26.2;
        double friendDistance = 1;  // how far friend can run on week one in miles
        int week = 1; // the week friend is starting in

        // while friend distance is less than marathon distance is true
        while (friendDistance < marathonDistance) {
            // multiply friendDistance by 1.10
            friendDistance = friendDistance * 1.10;
            // week is added by an increment of 1 for each loop
            week++;
            // displays the week and calculated distance
            System.out.printf("For week %d, my friend ran %.2f miles \n", week, friendDistance);
        }
    }
}
