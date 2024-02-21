package week2;

import static input.InputUtils.stringInput;

public class secretPassword {
    public static void main(String[] args) {
        String secretPassword = "kittens";
        String userPasswrd = stringInput("Enter the password please: ");
        int maxGuesses = 5;
        while (!userPasswrd.equals(secretPassword) && maxGuesses > 0) {
            System.out.println("Password incorrect, access denied!");
            System.out.println("Try again");
            userPasswrd = stringInput("Enter the password please: ");
            maxGuesses--;

        }
        if (maxGuesses > 1) {
            System.out.println("Correct! Access granted.");
        } else {
            System.out.println("You have been locked out.");
        }
    }
}
