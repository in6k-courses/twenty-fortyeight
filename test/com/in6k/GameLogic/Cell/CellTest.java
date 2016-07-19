package com.in6k.GameLogic.Cell;

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
    public void emptyCellRenderedTest () throws Exception {
        String expectCell = CellWrapper.wrapper(emptyCell.getNumber());
        assertThat(emptyCell.renderedCell(), is(expectCell));
    }

    @Test
    public void parameterCellRenderedTest() throws Exception {
        String expectCell = CellWrapper.wrapper(parameterCell.getNumber());
        assertThat(parameterCell.renderedCell(), is(expectCell));
    }

    @Test
    public void maxNumberCellRenderTest () throws Exception {
        parameterCell = new GameCell(2048);
        String expectCell = CellWrapper.wrapper(parameterCell.getNumber());
        assertThat(parameterCell.renderedCell(), is(expectCell));
    }
}