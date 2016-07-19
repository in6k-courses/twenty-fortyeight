package com.in6k.GameLogic.Board;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GameBoardTest {

    private GameBoard board;

    private String[][] testBoard;
    private int boardSize;

    @Before
    public void setUp() throws Exception {
        board = new GameBoard();
        boardSize = board.getBoardSize();
        testBoard = new String[boardSize][boardSize];
    }

    @Test
    public void emptyGameBoardTest() throws Exception {
        assertThat(board.getBoard(), is(testBoard));
    }



}