package week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class months {
    public static void main(String[] args) throws IOException {
        /*
        This program writes an array called months to a txt file called months.txt
         */
        // months array
        String[] months = {"Jan", "Feb", "Mar"};

        // creates a buffered and file writer
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("months.txt"));

        // enhanced for loop that writes each index being looped to a newline in the months txt file
        for (String month : months) {
            bufferedWriter.write(month + "\n");
        }

        bufferedWriter.close(); // closes the file

    }
}
