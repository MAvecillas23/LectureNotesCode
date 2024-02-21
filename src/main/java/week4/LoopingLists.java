package week4;

import java.util.ArrayList;
import java.util.List;

public class LoopingLists {
    public static void main(String[] args) {
        // examples of how to loop through lists
        List<String> classNames = new ArrayList<>();
        classNames.add("Programming Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info Tech Management");

        // using an enhanced for loop/ foreach loop
        for (String name: classNames) {
            System.out.println(name);

        }

        // using a standard for loop
        System.out.println();
        for (int i = 0; i <classNames.size() ; i++) {
            // only difference being when you print
            // you have to use the variableName with get() and
            // the loop variable inside the parenthesis of get()...
            // variableName.get(i)
            System.out.println(classNames.get(i));
        }
        System.out.println();
        // if you want to remove data from a list using a loop...
        // its better and easier to use a while as opposed to a for loop
        // while loops will avoid exception errors
        //for example

        // a while loop that checks that if objects in each index aren't
        // empty... then remove the object in the index
        while (!classNames.isEmpty()) {
            String name = classNames.remove(0);
            System.out.println(name);
        }
        // after while loop is finished... printing returns an empty list
        System.out.println(classNames);

    }
}
