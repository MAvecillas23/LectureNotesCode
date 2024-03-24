package week7;

import java.util.Date;

public class Dates {
    public static void main(String[] args) {
        // A Data object represents a point in time
        // For example, Wednesday October 26 2022, 3:05pm, CST

        Date now = new Date(); // create new Date object
        System.out.println(now); // prints current day of the week, month, day, time, timezone, year

        // number of milliseconds since Midnight January 1, 1970, UTC
        System.out.println(now.getTime());

        long milliseconds = now.getTime(); // assigning now to a variable
        System.out.println(milliseconds); // printing the variable

        // num of milliseconds we want to get date from
        long numberOfMilliseconds = 123223423323L; // L at the end to tell java this is a long value and not an integer
        Date date1973 = new Date(numberOfMilliseconds); // gets the exact date and time in the past or future using milliseconds
        System.out.println(date1973); // prints variable

        // can use if statements to check if variable data is before
        // now's date
        if (date1973.before(now)) {

            System.out.println("1973 is earlier than now");

        }




    }
}
