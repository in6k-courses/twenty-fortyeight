package com.in6k.ScoreManager;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ScoreTest {

    private Score emptyScore;
    private Score parametersScore;

    private int testPoints = 100;
    private LocalDateTime testTime = LocalDateTime.MAX;

    @Before
    public void setUp () throws Exception {
        emptyScore = new Score();
        parametersScore = new Score(testPoints, testTime);
    }

    @Test
    public void pointsEmptyScoreTest() throws Exception {
        assertThat(emptyScore.getPoints(), is(0));
    }

    @Test
    public void timeEmptyScoreTest() throws Exception {
        assertThat(emptyScore.getTime(), is(LocalDateTime.MIN));
    }

    @Test
    public void pointsParametersScoreTest() throws Exception {
        assertThat(parametersScore.getPoints(), is(testPoints));
    }

    @Test
    public void timeParametersScoreTest() throws Exception {
        assertThat(parametersScore.getTime(), is(testTime));
    }
}