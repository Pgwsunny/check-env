package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void should_return_1_given_1() {
        //given
        FizzBuzz fizzbuzz = new FizzBuzz();
        //when
        String result =fizzbuzz.say(1);

        //then
        assertEquals("1",result);


    }
}
