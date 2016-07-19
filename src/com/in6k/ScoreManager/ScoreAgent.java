package com.in6k.ScoreManager;

import java.util.ArrayList;
import java.util.List;

public class ScoreAgent {

    private int score;

    public ScoreAgent () {
        score = 0;
    }

    public int getScore() {
        return score;
    }

    public void addPoints(int points) {
        if (points >= 0) {
            score += points;
        }
    }

}