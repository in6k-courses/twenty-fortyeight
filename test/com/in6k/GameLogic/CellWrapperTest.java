package com.in6k.GameLogic;

import com.in6k.GameLogic.Cell.CellWrapper;
import com.in6k.GameResource.Color;
import com.in6k.GameResource.Delimiter;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CellWrapperTest {

    @Before
    public void setUp() throws Exception {
        CellWrapper.initializeCellWrapper();
    }

    private void executeWrapperTest(int testNumber, String color) {
        String expectWrapper = cellDelimiterWrapper(color, testNumber);
        String actualWrapper = CellWrapper.wrapper(testNumber);
        assertThat(actualWrapper, is(expectWrapper));
    }

    private String cellDelimiterWrapper(String color, int number) {
        String numberToString = (number == 0) ? " " : String.valueOf(number);
        String formatted = String.format("%4s", numberToString);
        return color + Delimiter.celleLeft + formatted + Delimiter.cellRight;
    }

    @Test
    public void emptyWrapperTest() throws Exception {
        executeWrapperTest(0, Color.white);
    }

    @Test
    public void redWrapperTest() throws Exception {
        executeWrapperTest(2, Color.red);
    }

    @Test
    public void greenWrapperTest() throws Exception {
        executeWrapperTest(4, Color.green);
    }

    @Test
    public void yellowWrapperTest() throws Exception {
        executeWrapperTest(8, Color.yellow);
    }

    @Test
    public void blueWrapperTest() throws Exception {
        executeWrapperTest(16, Color.blue);
    }

    @Test
    public void purpleTwoWrapperTest() throws Exception {
        executeWrapperTest(32, Color.purple);
    }

    @Test
    public void skyBlueWrapperTest() throws Exception {
        executeWrapperTest(64, Color.skyBlue);
    }

    @Test
    public void greenBackWrapperTest() throws Exception {
        executeWrapperTest(128, Color.greenBack);
    }

    @Test
    public void blueBackWrapperTest() throws Exception {
        executeWrapperTest(256, Color.blueBack);
    }

    @Test
    public void purpleBackWrapperTest() throws Exception {
        executeWrapperTest(512, Color.purpleBack);
    }

    @Test
    public void yellowBackWrapperTest() throws Exception {
        executeWrapperTest(1024, Color.yellowBack);
    }

    @Test
    public void whiteBackWrapperTest() throws Exception {
        executeWrapperTest(2048, Color.whiteBack);
    }
}
