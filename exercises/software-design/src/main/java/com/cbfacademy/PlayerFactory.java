package com.cbfacademy;

/**
 * Factory class for creating player instances.
 */
public class PlayerFactory {
    /**
     * Creates a new player with the specified name.
     *
     * @param name The name of the player.
     * @return A new player instance.
     */
    public static Player create(String name) {
        return new DicePlayer(name);
    }
}
