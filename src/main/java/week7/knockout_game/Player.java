package week7.knockout_game;

public class Player {

    private String name; // player name
    private boolean knockedOut; // are they still in the game
    private int knockoutNumber; // knock out number


    // constructor
    public Player(String name) {
        this.name = name;
        this.knockedOut = false;
    }

    // this plays the game for the players turn
    public String playTurn(DiceCup diceCup) {
        // rolls dice
        // gets the score of the dice
        int score = diceCup.rollAll();
        // if the score matches the dice
        if (playerKnockedOut(score)) {
            // player was knocked out is true
            knockedOut = true;
        }

        // this is displayed to the player
        String resultTemplate = "Player %s rolled a total of %d and %s knocked out. (Your knockout number was %d.)";

        // if player was not knocked out
        String knockedOutOrNot = "was not";
        // if player was knocked out
        if (knockedOut) {
            knockedOutOrNot = "was";
        }
        // displayed to the player with their name, score, knocked out, and the number that knocked them out
        String result = String.format(resultTemplate, name, score, knockedOutOrNot, knockoutNumber);

        return result; // returns result
    }

    // checks if player was knocked out
    // score is equal to knock out number
    // true or false if player was knocked out
    public boolean playerKnockedOut(int score) {
        if (score == knockoutNumber) {
            return true;
        } else {
            return false;
        }
    }

    // getter and setters for fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isKnockedOut() {
        return knockedOut;
    }

    public void setKnockedOut(boolean knockedOut) {
        this.knockedOut = knockedOut;
    }

    public int getKnockoutNumber() {
        return knockoutNumber;
    }

    public void setKnockoutNumber(int knockoutNumber) {
        this.knockoutNumber = knockoutNumber;
    }

}
