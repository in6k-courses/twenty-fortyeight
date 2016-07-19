package com.in6k.GameLogic.Board;

public class GameBoard {

    private String[][] board;
    private int boardSize;

    public GameBoard() {
        this(4);
    }

    public GameBoard(int i) {
        this.boardSize = 4;
        this.board = new String[boardSize][boardSize];
    }

    public String[][] getBoard() {
        return board;
    }

    public int getBoardSize() {
        return boardSize;
    }




}