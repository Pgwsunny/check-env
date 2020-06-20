package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuessNumberTest {
    @Test
    public void should_return_4A0B_when_input_1234_given_1234() {
        //given
        gameAnswer gameanswer = new gameAnswer("1 2 3 4");
        //when
        String result = gameanswer.check("1 2 3 4");
        //then
        Assert.assertEquals("4A0B",result);
    }
    @Test
    public void should_return_1A0B_when_input_1234_given_1567() {
        //given
        gameAnswer gameanswer = new gameAnswer("1 2 3 4");
        //when
        String result = gameanswer.check("1 5 6 7");
        //then
        Assert.assertEquals("1A0B",result);
    }

    @Test
    public void should_return_1A1B_when_input_1234_given_1467() {
        //given
        gameAnswer gameanswer = new gameAnswer("1 2 3 4");
        //when
        String result = gameanswer.check("1 4 6 7");
        //then
        Assert.assertEquals("1A1B",result);
    }
}
