package com.in6k.GameLogic;

import com.in6k.GameResource.Color;
import com.in6k.GameResource.Delimiter;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CellWrapperTest {

    private CellWrapper cellWrapper;

    @Before
    public void setUp() throws Exception {
        cellWrapper = new CellWrapper();
    }

    private void executeTest(int testNumber, String color) {
        String expectWrapper = cellDelimiterWrapper(color, testNumber);
        String actualWrapper = cellWrapper.wrapper(testNumber);
        assertThat(actualWrapper, is(expectWrapper));
    }

    private String cellDelimiterWrapper(String color, int number) {
        String numberToString = (number == 0) ? " " : String.valueOf(number);
        String formatted = String.format("%4s", numberToString);
        return color + Delimiter.celleLeft + formatted + Delimiter.cellRigth;
    }

    @Test
    public void emptyWrapperTest() throws Exception {
        executeTest(0, Color.white);
    }

    @Test
    public void redWrapperTest() throws Exception {
        executeTest(2, Color.red);
    }

    @Test
    public void greenWrapperTest() throws Exception {
        executeTest(4, Color.green);
    }

    @Test
    public void yellowWrapperTest() throws Exception {
        executeTest(8, Color.yellow);
    }

    @Test
    public void blueWrapperTest() throws Exception {
        executeTest(16, Color.blue);
    }

    @Test
    public void purpleTwoWrapperTest() throws Exception {
        executeTest(32, Color.purple);
    }

    @Test
    public void skyBlueWrapperTest() throws Exception {
        executeTest(64, Color.skyBlue);
    }

    @Test
    public void greenBackWrapperTest() throws Exception {
        executeTest(128, Color.greenBack);
    }

    @Test
    public void blueBackWrapperTest() throws Exception {
        executeTest(256, Color.blueBack);
    }

    @Test
    public void purpleBackWrapperTest() throws Exception {
        executeTest(512, Color.purpleBack);
    }

    @Test
    public void yellowBackWrapperTest() throws Exception {
        executeTest(1024, Color.yellowBack);
    }

    @Test
    public void whiteBackWrapperTest() throws Exception {
        executeTest(2048, Color.whiteBack);
    }
}
