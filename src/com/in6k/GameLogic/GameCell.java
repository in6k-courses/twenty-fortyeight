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

    public void increaseNumber() {
        if (number == 2048)
            return;
        this.number = (number == 0) ? 2 : number * 2;
    }

    public String renderedCell () {
        return CellWrapper.wrapper(number);
    }
}