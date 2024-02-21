package week3;

import static input.InputUtils.stringInput;

public class helloMethods {
    public static void main(String[] args) {
        String name = stringInput("Please enter your name");
        String greeting = makeGreeting(name);
        System.out.println(greeting);

    }       // end of the main method
        // for now to create a method we will create it using public static and the data type
    // you expect the method to return
    // for example, this method will be returning a string.
    public static String makeGreeting(String n){
        String greeting = "Hello " + n + "!";
        return greeting;
    }       // end of the makeGreeting method

} // end of the helloMethods class
