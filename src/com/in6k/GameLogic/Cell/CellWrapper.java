package com.in6k.GameLogic.Cell;

import com.in6k.GameResource.Color;
import com.in6k.GameResource.Delimiter;

import java.util.HashMap;
import java.util.Map;

public class CellWrapper {

    private static Map<Integer, String> colors = new HashMap<>();

    static {
        colors.put(0, Color.WHITE);
        colors.put(2, Color.RED);
        colors.put(4, Color.GREEN);
        colors.put(8, Color.YELLOW);
        colors.put(16, Color.BLUE);
        colors.put(32, Color.PURPLE);
        colors.put(64, Color.SKY_BLUE);
        colors.put(128, Color.GREEN_BACK);
        colors.put(256, Color.BLUE_BACK);
        colors.put(512, Color.PURPLE_BACK);
        colors.put(1024, Color.YELLOW_BACK);
        colors.put(2048, Color.WHITE_BACK);
    }

    public static String wrapper(int number) {
        String numberToString = (number == 0) ? " " : String.valueOf(number);
        String formatted = String.format("%4s", numberToString);
        return colors.get(number)
                + Delimiter.CELLE_LEFT
                + formatted
                + Delimiter.CELL_RIGHT;
    }
}