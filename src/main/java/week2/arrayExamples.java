package week2;

import java.util.Arrays;

public class arrayExamples {
    public static void main(String[] args) {
        // this prints my classes for this semester

        // this creates an array with my class names
        String[] classes = {"English", "Java", "Research Methods", "Project Management"};
        int[] numbers = {1, 2, 3};

        //this for loop will loop between the classes array...
        // classes[x] will be how the loop finds the index... using the x loop counter
        for (int x = 0; x < 4; x++){
            System.out.println("A class name is " + classes[x]);

        }

        // To print arrays using sout... You have to first convert the array to a string...
        // for example:

        System.out.println(Arrays.toString(classes)); // so... Arrays.toString(variableName);


    }
}
