package com.Ado;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 1000;

        int highScore = calculatScore(gameOver, score, levelCompleted, bonus);
        System.out.println(" Your finalScore was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculatScore(gameOver, score, levelCompleted, bonus);
        System.out.println(" Your finalScore was " + highScore);

        int highScorePosition = calcuraterHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calcuraterHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calcuraterHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calcuraterHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);

        highScorePosition = calcuraterHighScorePosition(1000);
        displayHighScorePosition("Louise", highScorePosition);

        highScorePosition = calcuraterHighScorePosition(500);
        displayHighScorePosition("Carol", highScorePosition);

        highScorePosition = calcuraterHighScorePosition(100);
        displayHighScorePosition("Frank", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorPosition) {
        System.out.println(playerName + " managned to get into position " + highScorPosition + " on the high score table ");
    }

    public static int calcuraterHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }

    public static int calculatScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }
}
