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

    @Test
    public void emptyWrapperTest() throws Exception {
        String expectWrapper = delimiterWrapper();
        String actualWrapper = cellWrapper.wrapper(0);
        assertThat(actualWrapper, is(expectWrapper));
    }

    private String delimiterWrapper() {
        return Delimiter.celleLeft + Color.white + 0 + Delimiter.cellRigth;
    }

}
