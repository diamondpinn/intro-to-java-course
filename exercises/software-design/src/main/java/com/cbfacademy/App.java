package com.cbfacademy;

/**
 * Main application to start the dice game.
 */
public class App {
    public static void main(String[] args) {
        // Create player instances
        Player player1 = PlayerFactory.create("Player 1");
        Player player2 = PlayerFactory.create("Player 2");

        // Create game instance using factory
        Game game = GameFactory.create(player1, player2);
        game.play();
    }
}
