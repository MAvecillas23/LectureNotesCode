package week3;

import java.util.Arrays;

public class corporateSponsors {
    public static void main(String[] args) {
        // this program creates a for loop that capitalizes every index in the sponsors array
        // using a for loop
        String[] sponsors = {"ikea", "at&t", "cvs", "3m"};
        for (int x = 0; x < sponsors.length; x++) {

            sponsors[x] = sponsors[x].toUpperCase();
        }
        System.out.println(Arrays.toString(sponsors));
    }
}
