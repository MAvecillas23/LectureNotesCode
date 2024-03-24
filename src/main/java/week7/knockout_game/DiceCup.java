package week7.knockout_game;

import java.util.ArrayList;
import java.util.List;

public class DiceCup {

    private List<Dice> allDice; // all dice going to be rolled field

    // gets number of dice
    // and adds them to the list
    public DiceCup(int numberOfDice) {
        allDice = new ArrayList<>();
        for (int d = 0; d < numberOfDice; d++) {
            Dice dice = new Dice();
            allDice.add(dice);
        }
    }

    // rolls all dice
    public int rollAll() {
        int total = 0;
        for (Dice dice : allDice) {
            int diceRoll = dice.roll();
            total = total + diceRoll;
        }

        return total; // gets total num of all dice rolled
    }

}
