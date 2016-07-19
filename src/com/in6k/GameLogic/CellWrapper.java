package com.in6k.GameLogic;

import com.in6k.GameResource.Color;
import com.in6k.GameResource.Delimiter;

import java.util.HashMap;
import java.util.Map;

public class CellWrapper {

    private Map<Integer, String> colorWrapper = new HashMap<>();

    public CellWrapper() {
       /* colorWrapper.add(0, Color.white);
        colorWrapper.add(2, Color.red);
        colorWrapper.add(4, Color.green);
        colorWrapper.add(8, Color.yellow);
        colorWrapper.add(16, Color.blue);
        colorWrapper.add(32, Color.purple);
        colorWrapper.add(64, Color.skyBlue);
        colorWrapper.add(128, Color.greenBack);
        colorWrapper.add(256, Color.blueBack);
        colorWrapper.add(512, Color.purpleBack);
        colorWrapper.add(1024, Color.yellowBack);
        colorWrapper.add(2048, Color.whiteBack);*/
    }

    public String wrapper(int number) {
        return Delimiter.left + colorWrapper.get(0) + number + Delimiter.rigth;
    }
}