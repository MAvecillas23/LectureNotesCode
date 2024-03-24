package week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HelloWriting {
    public static void main(String[] args) throws IOException { // "throws IOException" gets rid of the red error lines
        // creates a new file.
        // file will be created if it does not exist...
        // if file does exist, that file will be the one that is worked on
        FileWriter writer = new FileWriter("hello.txt");
        // creates a BufferedWriter which allows java to be able to make changes to the file
        // being worked on
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        // using the bufferedWriter variable with the write() method allows
        // to write strings into the txt file
        bufferedWriter.write("Hello!\n");
        bufferedWriter.write("More data here\n");
        bufferedWriter.write("Goodbye!\n");
        // always make sure to close the writer otherwise the data won't be added
        bufferedWriter.close();


        // creating a new FileWriter and BufferedWriter with the same file name as the one above (hello.txt)
        // and adding new data to it doesn't add/ append data to the file... it overwrites it
        // if you want to append data to an existing file... you have to add true at the end of the writer2
        // variable statement as shown below

        FileWriter writer2 = new FileWriter("hello.txt", true); // called the append flag...
                                                                                // true means add data to the end of the file
        BufferedWriter bufferedWriter2 = new BufferedWriter(writer2);
        bufferedWriter2.write("New data\n");
        bufferedWriter2.write("More data\n");
        bufferedWriter2.write("End of file\n");

        bufferedWriter2.close();

    }
}
