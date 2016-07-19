package com.in6k.GameLogic;

import com.in6k.GameResource.Color;
import com.in6k.GameResource.Delimiter;

import java.util.HashMap;
import java.util.Map;

public class CellWrapper {

    private Map<Integer, String> colors = new HashMap<>();

    public CellWrapper() {
        colors.put(0, Color.white);
        colors.put(2, Color.red);
        colors.put(4, Color.green);
        colors.put(8, Color.yellow);
        colors.put(16, Color.blue);
        colors.put(32, Color.purple);
        colors.put(64, Color.skyBlue);
        colors.put(128, Color.greenBack);
        colors.put(256, Color.blueBack);
        colors.put(512, Color.purpleBack);
        colors.put(1024, Color.yellowBack);
        colors.put(2048, Color.whiteBack);
    }

    public String wrapper(int number) {
        String numberToString = (number == 0) ? " " : String.valueOf(number);
        String formatted = String.format("%4s", numberToString);
        return colors.get(number)
                + Delimiter.celleLeft
                + formatted
                + Delimiter.cellRigth;
    }
}