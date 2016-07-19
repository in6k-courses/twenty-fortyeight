package com.in6k.ScoreManager;

import java.time.LocalDateTime;

public class Score {

    private int points;
    private LocalDateTime time;
    private boolean lastScore;

    public Score () {
        this.points = 0;
        this.time = LocalDateTime.MIN;
        this.lastScore = false;
    }

    public Score(int points, LocalDateTime time) {
        this.points = points;
        this.time = time;
        this.lastScore = false;
    }

    public Score(int points, LocalDateTime time, boolean last) {
        this.points = points;
        this.time = time;
        this.lastScore = last;
    }

    public int getPoints() {
        return points;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public boolean isLastScore() {
        return lastScore;
    }
}