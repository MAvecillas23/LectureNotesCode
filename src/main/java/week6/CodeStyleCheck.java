package week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CodeStyleCheck {
    public static void main(String[] args) {
        // this program reads a java file and checks whether it has more than 100 characters in each line
        // name of file to be read
        String fileName = "ReadNumbersFromFile.java";
        // use try with resource to ensure file gets closed with or without exception errors
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            // line will be the reader
        String line = bufferedReader.readLine();
        // line counter that will keep track of each line being looped
        int lineCounter = 1;
        // if no lines are over 100 characters bool will remain false
        boolean linesTooLong = false;
        // while loop that loops until the end of file
        while (line != null) {
            // if the length of the line (characters) is greater than 100
            if (line.length() > 100) {
                // lets user know which line is too long and displays the line number too
                System.out.println("Line " + lineCounter + " is too long: " + line);
                linesTooLong = true;
            }
            // for each loop the counter increases by 1 to show the next line to be read
            lineCounter++;
            // updates the next line to be read for the next loop
            line = bufferedReader.readLine();
        }
        // if linesTooLong is true/ if lines over 100 characters were displayed
        if (linesTooLong) {
            // informs user
            System.out.println("There were lines that were too long");
        } else {
            // if there no lines that were greater than 100 characters
            // this is shown to the user
            System.out.println("There were no lines that were greater than 100 characters");
        }
        // if an IOException error is caught
    } catch (IOException e) {
            // it informs the user
            System.out.println("File " + fileName + " cannot be found or read " + e);

        }


} }


