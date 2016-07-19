package com.in6k.GameLogic;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CellTest {

    private GameCell emptyCell;
    private GameCell parameterCell;

    private int testNumber = 32;

    @Before
    public void setUp () throws Exception {
        emptyCell = new GameCell();
        parameterCell = new GameCell(testNumber);
        CellWrapper.initializeCellWrapper();
    }

    @Test
    public void checkNumberEmptyCellTest() throws Exception {
        assertThat(emptyCell.getNumber(), is(0));
    }

    @Test
    public void numberFromCellWithParameter() throws Exception {
        assertThat(parameterCell.getNumber(), is(testNumber));
    }

    @Test
    public void emptyCellIncreaseNumberTest() throws Exception {
        emptyCell.increaseNumber();
        assertThat(emptyCell.getNumber(), is(2));
    }

    @Test
    public void parameterCellIncreaseNumber() throws Exception {
        parameterCell.increaseNumber();
        assertThat(parameterCell.getNumber(), is(testNumber * 2));
    }

    @Test
    public void maxValueIncreaseTest() throws Exception {
        parameterCell = new GameCell(2048);
        parameterCell.increaseNumber();
        assertThat(parameterCell.getNumber(), is(2048));
    }

    @Test
    public void renderedEmptyCellTest () throws Exception {
        String renderedCell = emptyCell.renderedCell();
        String expectCell = CellWrapper.wrapper(emptyCell.getNumber());
        System.out.println(renderedCell + " " + expectCell);
        assertThat(renderedCell, is(expectCell));
    }

    @Test
    public void maxNumberCellTest () throws Exception {
        parameterCell = new GameCell(2048);
        String renderedCell = parameterCell.renderedCell();
        String expectCell = CellWrapper.wrapper(parameterCell.getNumber());
        assertThat(renderedCell, is(expectCell));
    }
}