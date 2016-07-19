package com.in6k.GameLogic.Board;

import com.in6k.GameLogic.Cell.GameCell;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class GameBoardTest {

    private GameBoard board;

    private GameCell[][] testBoard;
    private int boardSize;

    @Before
    public void setUp() throws Exception {
        board = new GameBoard();
        boardSize = board.getBoardSize();
        testBoard = new GameCell[boardSize][boardSize];
    }

    @Test
    public void emptyGameBoardTest() throws Exception {
        assertThat(board.getBoard(), is(testBoard));
    }

    @Test
    public void boardWithEmptyCellsTest() throws Exception {
        board.initializeBoard();
        testBoard = TestHelper.initTestBoardEmptyCells(testBoard, boardSize);

        List<Integer> testItems = TestHelper.getItemsFromBoards(testBoard, boardSize);
        List<Integer> boardItems = TestHelper.getItemsFromBoards(board.getBoard(), boardSize);

        assertThat(testItems, equalTo(boardItems));
    }




}