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
        System.out.println(actualWrapper);
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
    public void twoWrapperTest() throws Exception {
        executeTest(2, Color.red);
    }

    @Test
    public void fourWrapperTest() throws Exception {
        executeTest(4, Color.green);
    }

    

}
