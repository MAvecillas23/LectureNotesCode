package week3;

import static input.InputUtils.stringInput;

public class helloMethods {
    public static void main(String[] args) {
        // this program greets the user by name
        // asks user to enter name
        String name = stringInput("Please enter your name");
        // sends name to makeGreeting method
        String greeting = makeGreeting(name);

        // displays the greeting
        System.out.println(greeting);

    }       // end of the main method
        // for now to create a method we will create it using public static and the data type
    // you expect the method to return
    // for example, this method will be returning a string.
    public static String makeGreeting(String n){
        // concatenates a greeting with the users name
        String greeting = "Hello " + n + "!";
        // returns the string back to main
        return greeting;
    }       // end of the makeGreeting method

} // end of the helloMethods class
