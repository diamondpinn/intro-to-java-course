package com.cbfacademy;

public class DiceGame implements Game {
    private Player player1;
    private Player player2;
    private int targetScore = 30;

    public DiceGame(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    @Override
    public String play() {
        int score1 = 0;
        int score2 = 0;
        String winner = null;

        System.out.println("Game started. Target score: " + targetScore);
        System.out.println();

        while (score1 < targetScore && score2 < targetScore) {
            score1 += player1.roll();
            score2 += player2.roll();
            System.out.println(player1.getName() + " rolled: " + score1);
            System.out.println(player2.getName() + " rolled: " + score2);
        }

        if (score1 > score2) {
            winner = player1.getName();
        } else if (score2 > score1) {
            winner = player2.getName();
        }

        if (winner == null) {
            System.out.println("It's a draw!");
        } else {
            System.out.println(winner + " wins!");
        }

        return winner;
    }
}
