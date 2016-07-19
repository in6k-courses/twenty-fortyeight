package com.in6k.GameLogic;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CellTest {

    private GameCell emptyCell;
    private GameCell parameterCell;

    private int testNumber = 7;

    @Before
    public void setUp () throws Exception {
        emptyCell = new GameCell();
        parameterCell = new GameCell(testNumber);
    }

    @Test
    public void checkNumberEmptyCellTest() throws Exception {
        assertThat(emptyCell.getCellNumber(), is(0));
    }

    @Test
    public void numberFromCellWithParameter() throws Exception {
        assertThat(parameterCell.getCellNumber(), is(testNumber));
    }


}