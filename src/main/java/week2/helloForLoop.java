package week2;

public class helloForLoop {
    public static void main(String[] args) {
        // this is an example of a for loop
        // for loops need what x equals... how far you want x to loop for.
        //in this case x loops until it reaches its 10th loop...
        // and a loop counter... x++ keeps track of the current loop it is at...
        // like c# ++ just increases x by an increment of 1.
        for (int x = 0; x < 10; x++ ) {
            System.out.println(x);
        }


        // this loop counts from 1 to 5.
        for (int x = 1; x <= 5; x++) {
            System.out.println(x);
        }

        // this loop counts down from 10 like a NASA rocket
        System.out.println("\n\n\n");
        System.out.println("Rocket will launch in T minus...");
        for (int countdown = 10; countdown >= 0; countdown--)  {
            System.out.println(countdown);
        }


        }
}
