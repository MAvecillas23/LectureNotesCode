package week6;

import java.util.List;

import static input.InputUtils.stringInput;

public class WindowVersion_InputValidation {
    public static void main(String[] args) {
        // another example of input validation
        // asks user to enter windows version
        // if the user input doesn't match the windowsVersions list
        // it will continue to ask the user using a while loop until
        // user enters valid input

        List<String> windowsVersions = List.of("XP", "7", "8", "9", "10");

        String windowsVersionsString = String.join(", ", windowsVersions);

        String version = stringInput("Enter the version of Windows from these choices: " + windowsVersionsString).toUpperCase();

        while (!windowsVersions.contains(version)){
            version = stringInput("Not a recognized version. " + "Enter your version of windows from these choices:" +
                    windowsVersionsString).toUpperCase();

        }

        System.out.println("Thanks your windows version is " + version);
    }
}
