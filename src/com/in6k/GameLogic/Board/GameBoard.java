package com.in6k.GameLogic.Board;

import com.in6k.GameLogic.Cell.GameCell;

public class GameBoard {

    private GameCell[][] board;
    private int boardSize;
    private Randomize randomize;

    public GameBoard() {
        this(new BoardRandomize());
    }

    public GameBoard(Randomize randomize) {
        this(4, randomize);
    }

    public GameBoard(int size, Randomize randomize) {
        this.boardSize = size;
        this.board = new GameCell[boardSize][boardSize];
        this.randomize = randomize;
    }

    public GameCell[][] getBoard() {
        return board;
    }

    public int getBoardSize() {
        return boardSize;
    }

    public Randomize getRandomize() {
        return randomize;
    }

    public void initializeBoard() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = new GameCell();
            }
        }
    }



}