package week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesReader {
    public static void main(String[] args) {
        String fileName = "file_that_doesn't_exist"; // try to open a file that doesn't exist
        // open the resource as the try block starts
        try (BufferedReader bufReader = new BufferedReader(new FileReader(fileName))) {

            String line = bufReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufReader.readLine();
            }
            // BufferedReader is automatically closed here
        }

        // If an exception is thrown the resources opened in the try statement is closed
        catch (IOException ioe) {
            System.out.println("Could not open or read " + fileName);
            System.out.println(ioe.toString());
            System.out.println("Reader and bufReader are automatically closed");
            System.out.println("Can do more error handling here if needed");
        }

    }
}
