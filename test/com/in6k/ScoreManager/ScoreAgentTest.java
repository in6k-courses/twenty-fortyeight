package com.in6k.ScoreManager;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ScoreAgentTest {

    private ScoreAgent scoreAgent;

    @Before
    public void setUp() throws Exception {
        scoreAgent = new ScoreAgent();
    }

    @Test
    public void afterCreateTest() throws Exception {
        assertThat(scoreAgent.getScore(), is(0));
    }

    @Test
    public void addPointsTest() throws Exception {
        scoreAgent.addPoints(10);
        assertThat(scoreAgent.getScore(), is(10));
    }

    @Test
    public void addNegativePointsTest() throws Exception {
        scoreAgent.addPoints(-10);
        assertThat(scoreAgent.getScore(), is(0));
    }

    

}