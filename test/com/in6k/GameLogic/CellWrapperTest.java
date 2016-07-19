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
    public void twoWrapperTest() throws Exception {
        executeTest(2, Color.red);
    }

    @Test
    public void fourWrapperTest() throws Exception {
        executeTest(4, Color.green);
    }

    @Test
    public void eightWrapperTest() throws Exception {
        executeTest(8, Color.yellow);
    }

    @Test
    public void sixteenWrapperTest() throws Exception {
        executeTest(16, Color.blue);
    }

    @Test
    public void thirtyTwoWrapperTest() throws Exception {
        executeTest(32, Color.purple);
    }

    @Test
    public void sixtyFourWrapperTest() throws Exception {
        executeTest(64, Color.skyBlue);
    }

    @Test
    public void oneTwoEighthWrapperTest() throws Exception {
        executeTest(128, Color.greenBack);
    }

    @Test
    public void twoFiveSixWrapperTest() throws Exception {
        executeTest(256, Color.blueBack);
    }

    @Test
    public void fiveOneTwoWrapperTest() throws Exception {
        executeTest(512, Color.purpleBack);
    }

    
}
