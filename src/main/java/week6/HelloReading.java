package week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HelloReading {
    public static void main(String[] args) throws IOException {
        // this class is an example of java reading the lines in the hello.txt file
        // creates a new file reader with the appropriate file name (hello.txt)
        FileReader reader = new FileReader("hello.txt");

        /*
        if you want to create a new file reader and buffered reader using one line of code
        do example:
        BufferedReader bufferedReader = new BufferedReader(new FileReader(hello.txt));
         */


        // buffered reader that wraps around the file reader
        BufferedReader bufferedReader = new BufferedReader(reader);

        // printing for each line reads each individual line in the file
        // there are only 6 lines that have data in it
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine()); // this readline returns null because it contains no more data
//
//        bufferedReader.close(); // always remember to close the file
//        System.out.println();
//        System.out.println();

        /*
        An easier way to read a file is by using a loop... this way you don't have to copy and paste multiple times,
        and it's easier to read lines if you are not sure how many lines a file contains
         */
        // assigns the readline method to a variable called line
        String line = bufferedReader.readLine();
        // loop until the end of file... which means until null is returned.

        while(line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }

        bufferedReader.close(); // always remember to close the file






    }
}
