package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class GameTest {
    @Test
    public void should_return_SUCCEED_when_input_1234_given_1234() {
        //given
        gameAnswer gameanswer = new gameAnswer("1 2 3 4");
        GuessNumberGame guessNumberGame = new GuessNumberGame(gameanswer);
        guessNumberGame.guess("1 2 3 4");
        //when
        GumeStatus gameStatus = guessNumberGame.getStatus();
        //then
        Assert.assertEquals(GumeStatus.SUCCEED,gameStatus);
    }

    @Test
    public void should_return_FAILED_when_input_3267_times_6_given_1234() {
        //given
        gameAnswer gameanswer = new gameAnswer("1 2 3 4");
        GuessNumberGame guessNumberGame = new GuessNumberGame(gameanswer);
        guessNumberGame.guess("3 2 6 7");
        guessNumberGame.guess("3 2 6 7");
        guessNumberGame.guess("3 2 6 7");
        guessNumberGame.guess("3 2 6 7");
        guessNumberGame.guess("3 2 6 7");
        guessNumberGame.guess("3 2 6 7");
        //when
        GumeStatus gameStatus = guessNumberGame.getStatus();
        //then
        Assert.assertEquals(GumeStatus.FAILED,gameStatus);
    }

    @Test
    public void should_return_CONTINUE_when_input_3267_times_1_given_1234() {
        //given
        gameAnswer gameanswer = new gameAnswer("1 2 3 4");
        GuessNumberGame guessNumberGame = new GuessNumberGame(gameanswer);
        guessNumberGame.guess("3 2 6 7");
        //when
        GumeStatus gameStatus = guessNumberGame.getStatus();
        //then
        Assert.assertEquals(GumeStatus.CONTINUE,gameStatus);
    }
}
