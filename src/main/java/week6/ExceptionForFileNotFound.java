package week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionForFileNotFound {
    public static void main(String[] args) {
        // This program is an example of a try catch exception handling
        // for a bufferedReader for a file that doesn't exist

        try { // try clause this block of code

            // Not_Found.txt does not exist... cannot read/ will crash without exception handling
            BufferedReader bufferedReader = new BufferedReader(new FileReader("Not_Found.txt"));
            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();

        } catch (IOException ex) {  // will catch the IOException if file is not found
            // will not crash the program, will just let user know file was not found
            System.out.println("Sorry, file not found. ");
        }

    }
}
