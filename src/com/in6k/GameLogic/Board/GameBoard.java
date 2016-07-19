package com.in6k.GameLogic.Board;

import com.in6k.GameLogic.Cell.GameCell;

public class GameBoard {

    private GameCell[][] board;
    private int boardSize;

    public GameBoard() {
        this(4);
    }

    public GameBoard(int size) {
        this.boardSize = size;
        this.board = new GameCell[boardSize][boardSize];
    }

    public GameCell[][] getBoard() {
        return board;
    }

    public int getBoardSize() {
        return boardSize;
    }

    public void initializeBoard() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = new GameCell();
            }
        }
    }



}