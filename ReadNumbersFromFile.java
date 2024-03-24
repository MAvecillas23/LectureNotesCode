package week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadNumbersFromFile {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        String fileName = "numbers.txt";
        // try with resources
        try (BufferedReader bufReader = new BufferedReader(new FileReader(fileName))) {
            String line = bufReader.readLine();

            while (line != null) {
                // ignore anything that isn't an integer
                try {
                    int number = Integer.parseInt(line);
                    numbers.add(number);
                    // catch NumberFormatException(s)
                } catch (NumberFormatException e) {
                    // ignore anything that isn't a number
                    System.out.println(line + " is not an integer, ignoring");
                }
                line = bufReader.readLine();
            }

            System.out.println(numbers);
        // catch IOExceptions
        } catch (IOException e) {
            System.out.println("Error reading file " + e);
        }
    }
}
