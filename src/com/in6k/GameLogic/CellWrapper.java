package com.in6k.GameLogic;

import com.in6k.GameResource.Color;
import com.in6k.GameResource.Delimiter;

import java.util.HashMap;
import java.util.Map;

public class CellWrapper {

    private Map<Integer, String> colorWrapper = new HashMap<>();

    public CellWrapper() {
        colorWrapper.put(0, Color.white);
        colorWrapper.put(2, Color.red);
        colorWrapper.put(4, Color.green);
        colorWrapper.put(8, Color.yellow);
        colorWrapper.put(16, Color.blue);
        colorWrapper.put(32, Color.purple);
        colorWrapper.put(64, Color.skyBlue);
        colorWrapper.put(128, Color.greenBack);
        colorWrapper.put(256, Color.blueBack);
        colorWrapper.put(512, Color.purpleBack);
        colorWrapper.put(1024, Color.yellowBack);
        colorWrapper.put(2048, Color.whiteBack);
    }

    public String wrapper(int number) {
        String color = colorWrapper.get(number);
        String numberToString = (number == 0) ? " " : String.valueOf(number);
        String formatted = String.format("%4s", numberToString);
        return color + Delimiter.celleLeft + formatted + Delimiter.cellRigth;
    }
}