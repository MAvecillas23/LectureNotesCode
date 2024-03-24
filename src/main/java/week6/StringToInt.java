package week6;

public class StringToInt {
    public static void main(String[] args) {
        // an example of exception handling
        // an example of converting a string to an integer but throws a NumberFormatException
        String hopeThisIsANumber = "cat";
        try { // try basically means "try this block of code"

            // This converts the String to an integer
            int number = Integer.parseInt(hopeThisIsANumber);
            System.out.printf("The number is %d", number);

        } catch (NumberFormatException x) { // when this exception is thrown/ caught...
            // this message is printed instead of the usual red stacktrace AND the program doesn't crash
            System.out.println(hopeThisIsANumber + " is not a valid integer string.");

        }
        System.out.println("This is the end of the program.");
        // exception handling stops the program from crashing
    }
}
