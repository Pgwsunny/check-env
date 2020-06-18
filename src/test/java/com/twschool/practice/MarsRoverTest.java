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

    @Test
    public void should_return_01N_given_00NM() {
        //given
        MarsLocation marslocationinit = new MarsLocation(0,0,"N");
        String command = "M";
        //when
        MarsRover marsrover= new MarsRover(marslocationinit);
        MarsLocation marslocation = marsrover.receive(command);

        //then
        assertEquals(0,marslocation.getX());
        assertEquals(1,marslocation.getY());
        assertEquals("N",marslocation.getDirection());
    }
    @Test
    public void should_return_00W_given_00NL() {
        //given
        MarsLocation marslocationinit = new MarsLocation(0,0,"N");
        String command = "L";
        //when
        MarsRover marsrover= new MarsRover(marslocationinit);
        MarsLocation marslocation = marsrover.receive(command);

        //then
        assertEquals(0,marslocation.getX());
        assertEquals(0,marslocation.getY());
        assertEquals("W",marslocation.getDirection());
    }
}
