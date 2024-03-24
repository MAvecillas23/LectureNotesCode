package week6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteArrayList {
    public static void main(String[] args) throws IOException {
        // this program is going to write Array Lists to a file

        // creates new lists using the ListOf() method
        List<String> classNames = List.of("Java", "Web", "C#");

        List<Integer> classCodes = List.of(2545, 2560, 2505);

        // creates a new buffered writer and file writer using one line of code
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("ITEC_Classes.txt"));

        // enhanced for loop that writes each index className onto a newline in the itec classes file
//        for (String name : classNames) {
//            bufferedWriter.write(name + "\n");
//
//        }
//
//        bufferedWriter.close(); // closes file

        // for loop that will write class name and class code to its respective line together
        for (int i = 0 ; i < classNames.size(); i++) {
            // assigns the index being looped to name
            String name = classNames.get(i);
            // assigns the class code from the classCodes array of the index of the class name being looped to code
            int code = classCodes.get(i);
            // writes the code and name that was gathered to the itec classes file
            bufferedWriter.write("ITEC " + code + " " + name + "\n");

        }
        bufferedWriter.close(); // closes the file

        // creates a buffered reader and file reader using one line
        BufferedReader bufferedReader = new BufferedReader(new FileReader("ITEC_Classes.txt"));
        // going to add the lines being read to a new array called classDescriptions
        List<String> classDescriptions = new ArrayList<>();

        //the line reader is assigned to a variable called line
        String line = bufferedReader.readLine();

        // while loop that reads each line until no data is returned
        while(line != null) {
            // the line being looped is added to the classDescriptions list
            classDescriptions.add(line);
            // updates the next line to be read and assigns it to the line variable
            line = bufferedReader.readLine();

        }

        System.out.println("End of file reached.");
        System.out.println(classDescriptions);



    }
}
