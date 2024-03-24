package week7.knockout_game;

import java.util.Random;

public class Dice {

    Random rnd = new Random(); // random number generator for 1 dice
    public int roll() {
        // because its a dice, number must be between 1 and 6
        return rnd.nextInt(6) + 1; // add 1, range between 1 and 6
    }

}
