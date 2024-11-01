package com.cbfacademy;

/**
 * Factory class for creating game instances.
 */
public class GameFactory {
    /**
     * Creates a new dice game with the given players.
     *
     * @param player1 The first player.
     * @param player2 The second player.
     * @return A new dice game instance.
     */
    public static Game create(Player player1, Player player2) {
        return new DiceGame(player1, player2);
    }
}
