package week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingVariables {
    public static void main(String[] args) throws IOException {
        // this class shows an example of how to use variables when working with files
        // assigned variables
        int classCode = 2454;
        double averageEnrollment = 22.16;
        String className = "Java";

        // creates new file
        FileWriter writer = new FileWriter("java.txt");
        // creates buffered writer
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        // writes/ adds the assigned variables to the files
        bufferedWriter.write(classCode + "\n");
        bufferedWriter.write(averageEnrollment + "\n");
        bufferedWriter.write(className + "\n");
        // closes the file
        // you can use either bufferedWriter or writer to close the file
        bufferedWriter.close();
        writer.close();


    }
}
