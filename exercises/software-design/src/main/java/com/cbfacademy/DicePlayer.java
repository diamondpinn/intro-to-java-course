package com.cbfacademy;

import java.util.Random;

/**
 * Represents a player that rolls a dice.
 */
public class DicePlayer implements Player {
    private String name;
    private Random random = new Random();

    public DicePlayer(String name) {
        this.name = name;
    }

    @Override
    public int roll() {
        return random.nextInt(6) + 1; // Simulates a dice roll
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name; // Set the player's name
    }
}
