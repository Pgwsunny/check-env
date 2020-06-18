package com.twschool.practice;


import org.junit.Test;

import java.rmi.MarshalException;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {

    @Test
    public void should_return_00N_given_00N() {
        //given
        MarsLocation marslocationinit = new MarsLocation(0,0,"N");

        //when
        MarsRover marsrover= new MarsRover(marslocationinit);
        MarsLocation marslocation = marsrover.getLocation();

        //then
        assertEquals(marslocationinit.getX(),marslocation.getX());
        assertEquals(marslocationinit.getY(),marslocationinit.getY());
        assertEquals(marslocation.getDirection(),marslocationinit.getDirection());
    }
}
