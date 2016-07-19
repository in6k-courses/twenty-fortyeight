package com.in6k.GameLogic.Board;

import com.in6k.GameLogic.Cell.GameCell;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class GameBoardTest implements Randomize {

    private GameBoard board;

    private GameCell[][] testBoard;
    private int boardSize;

    @Before
    public void setUp() throws Exception {
        board = new GameBoard(this);
        boardSize = board.getBoardSize();
        testBoard = new GameCell[boardSize][boardSize];
    }

    @Test
    public void emptyGameBoardTest() throws Exception {
        assertThat(board.getBoard(), is(testBoard));
    }

    @Test
    public void boardWithEmptyCellsTest() throws Exception {
        initializeBoardsEmptyCells();
        List<Integer> testItems = TestHelper.getItemsFromBoards(testBoard, boardSize);
        List<Integer> boardItems = TestHelper.getItemsFromBoards(board.getBoard(), boardSize);
        assertThat(testItems, equalTo(boardItems));
    }

    private void initializeBoardsEmptyCells() {
        board.initializeBoard();
        testBoard = TestHelper.initTestBoardEmptyCells(testBoard, boardSize);
    }

    @Test
    public void generateRandomPointWithNumberTest() throws Exception {
        Point point = generateRandomPoint();
        int actualNumber = board.getBoard()[point.getX()][point.getY()].getNumber();
        int expectNumber = generateRandomNumber();
        assertThat(actualNumber, is(expectNumber));
    }

    @Override
    public Point generateRandomPoint() {
        Point p = new Point(3,3);
        board.getBoard()[3][3] = new GameCell(generateRandomNumber());
        return p;
    }

    @Override
    public int generateRandomNumber() {
        return 2;
    }


}