package com.in6k.GameLogic.Board.SupportBoardItems;

import java.util.Random;

public class BoardRandomize implements Randomize {

    private Random random = new Random();

    @Override
    public Point generateRandomPoint(int maxValue) {
        int x = random.nextInt(maxValue);
        int y = random.nextInt(maxValue);
        return new Point(x, y);
    }

    @Override
    public int generateRandomNumber() {
        int randomNumber = random.nextInt(100);
        return randomNumber > 25 ? 2 : 4;
    }
}