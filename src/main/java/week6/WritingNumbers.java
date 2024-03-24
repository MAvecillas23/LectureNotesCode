package week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingNumbers {
    public static void main(String[] args) throws IOException {
        // another example of writing data onto a file using variables
        // the write() method expects ONLY strings to be added to files .
        // if you add integers that are bunched together to your write methods those integers are converted to its respective
        // unicode number... the data variables below bunched together are converted to the letters CAT
        // if you try adding a double to your write method an exception error is thrown.
        int data1 = 67;
        int data2 = 65;
        int data3 = 84;

        double number = 12.34;

        FileWriter writer = new FileWriter("numbers.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        // one way to keep the character numbers in your files is by adding a newline between each int number
        // same with double variables
        // adding a newline between each variable converts the integers into strings
        bufferedWriter.write(data1 + "\n");
        bufferedWriter.write(data2 + "\n");
        bufferedWriter.write(data3 + "\n"); //int number argument

        bufferedWriter.write(number + "\n");
        bufferedWriter.write("test"); //write a string

        /*
        Other ways to convert int/ double values to strings without needing to have a newline are by using:
        Examples:
        bufferedWriter.write(Integer.toString(data1));
                            or
        using an empty string like: bufferedWriter.write(data1 + "");

         */

        bufferedWriter.close();
    }
}
