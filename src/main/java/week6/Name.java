package week6;

import java.io.*;

public class Name {
    public static void main(String[] args) throws IOException { // throws IOException
        // this program writes my name, favorite color, and class code 2545 to a file named name.txt

        // creates a file writer and buffered writer
        FileWriter writer = new FileWriter("name.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        // creates a file reader and buffered reader
        FileReader reader = new FileReader("name.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        // writes data to the name.txt file
        bufferedWriter.write("Michael\n");
        bufferedWriter.write("neon green \n");
        bufferedWriter.write(2545 + "");

        bufferedWriter.close(); // closes the file in order to add data to the txt file

        // assigns the readline method to the reader to a variable called line
        String line = bufferedReader.readLine();

        // while loop that reads each line with data until the end of the file..., until the reader returns null/ no more data
        while (line != null) {
            // prints the line being looped
            System.out.println(line);
            // updates the next line to be read
            line = bufferedReader.readLine();
        }

        bufferedReader.close(); // closes the file again


    }
}
