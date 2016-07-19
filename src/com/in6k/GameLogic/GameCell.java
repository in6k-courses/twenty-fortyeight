package com.in6k.GameLogic;

public class GameCell {

    private int number;

    public GameCell () {
        this(0);
    }

    public GameCell (int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void increaseNumber(int number) {
        this.number += number;
    }

    

}