package SnakesAndLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    int diceCount;
    public Dice(int diceCount)
    {
        this.diceCount = diceCount;
    }
    int rollDice()
    {
        int val = ThreadLocalRandom.current().nextInt(1, 7);
        return val;
    }
}
