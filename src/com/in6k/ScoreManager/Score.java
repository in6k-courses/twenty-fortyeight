package com.in6k.ScoreManager;

import java.time.LocalDateTime;

public class Score {

    private int points;
    private LocalDateTime time;

    public Score () {
        this.points = 0;
        this.time = LocalDateTime.MIN;
    }

    public Score(int points, LocalDateTime time) {
        this.points = points;
        this.time = time;
    }

    public int getPoints() {
        return points;
    }

    public LocalDateTime getTime() {
        return time;
    }
}