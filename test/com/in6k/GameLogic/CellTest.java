package com.in6k.GameLogic;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CellTest {

    private GameCell gameCell;

    @Before
    public void setUp () throws Exception {
        gameCell = new GameCell();
    }

    @Test
    public void checkNumberEmptyCellTest() throws Exception {
        assertThat(gameCell.getNumber(), is(0));

    }
}
