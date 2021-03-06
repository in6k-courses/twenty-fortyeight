package com.in6k.ScoreManager;

public class ScoreAgent {

    private int score;

    public ScoreAgent () {
        score = 0;
    }

    public int getScore() {
        return score;
    }

    public void addPoints(int points) {
        if (points < 0) {
            throw  new RuntimeException("Negatives not allowed.");
        }
        score += points;
    }

}