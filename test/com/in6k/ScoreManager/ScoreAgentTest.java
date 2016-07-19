package com.in6k.ScoreManager;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class ScoreAgentTest {

    private ScoreAgent scoreAgent;

    @Before
    public void setUp() throws Exception {
        scoreAgent = new ScoreAgent();
    }

    @Test
    public void afterCreateTest() throws Exception {
        int actualScore = scoreAgent.getScore();
        assertThat(actualScore, is(0));
    }
}