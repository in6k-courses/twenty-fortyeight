package com.in6k.GameLogic.Board;

import com.in6k.GameLogic.Cell.GameCell;

import java.util.ArrayList;
import java.util.List;

public class TestHelper {

    public static GameCell[][] initTestBoardEmptyCells(GameCell[][] board, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = new GameCell();
            }
        }
        return board;
    }

    public static List<Integer> getItemsFromBoards (GameCell[][] board, int size) {
        List<Integer> items = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                items.add(board[i][j].getNumber());
            }
        }
        return items;
    }
}
