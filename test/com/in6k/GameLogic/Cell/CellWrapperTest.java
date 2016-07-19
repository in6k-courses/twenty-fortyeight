package com.in6k.GameLogic.Cell;

import com.in6k.GameResource.Color;
import com.in6k.GameResource.Delimiter;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CellWrapperTest {

    private void executeColorWrapperTest(int testNumber, String color) {
        String expectWrapper = cellDelimiterWrapper(color, testNumber);
        String actualWrapper = CellWrapper.wrapper(testNumber);
        assertThat(actualWrapper, is(expectWrapper));
    }

    private String cellDelimiterWrapper(String color, int number) {
        String numberToString = (number == 0) ? " " : String.valueOf(number);
        String formatted = String.format("%4s", numberToString);
        return color + Delimiter.CELLE_LEFT + formatted + Delimiter.CELL_RIGHT;
    }

    @Test
    public void emptyWrapperTest() throws Exception {
        executeColorWrapperTest(0, Color.WHITE);
    }

    @Test
    public void redWrapperTest() throws Exception {
        executeColorWrapperTest(2, Color.RED);
    }

    @Test
    public void greenWrapperTest() throws Exception {
        executeColorWrapperTest(4, Color.GREEN);
    }

    @Test
    public void yellowWrapperTest() throws Exception {
        executeColorWrapperTest(8, Color.YELLOW);
    }

    @Test
    public void blueWrapperTest() throws Exception {
        executeColorWrapperTest(16, Color.BLUE);
    }

    @Test
    public void purpleTwoWrapperTest() throws Exception {
        executeColorWrapperTest(32, Color.PURPLE);
    }

    @Test
    public void skyBlueWrapperTest() throws Exception {
        executeColorWrapperTest(64, Color.SKY_BLUE);
    }

    @Test
    public void greenBackWrapperTest() throws Exception {
        executeColorWrapperTest(128, Color.GREEN_BACK);
    }

    @Test
    public void blueBackWrapperTest() throws Exception {
        executeColorWrapperTest(256, Color.BLUE_BACK);
    }

    @Test
    public void purpleBackWrapperTest() throws Exception {
        executeColorWrapperTest(512, Color.PURPLE_BACK);
    }

    @Test
    public void yellowBackWrapperTest() throws Exception {
        executeColorWrapperTest(1024, Color.YELLOW_BACK);
    }

    @Test
    public void whiteBackWrapperTest() throws Exception {
        executeColorWrapperTest(2048, Color.WHITE_BACK);
    }
}