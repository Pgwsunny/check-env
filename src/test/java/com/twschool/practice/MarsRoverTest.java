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
    @Test
    public void should_return_00E_given_00NR() {
        //given
        MarsLocation marslocationinit = new MarsLocation(0,0,"N");
        String command = "R";
        //when
        MarsRover marsrover= new MarsRover(marslocationinit);
        MarsLocation marslocation = marsrover.receive(command);

        //then
        assertEquals(0,marslocation.getX());
        assertEquals(0,marslocation.getY());
        assertEquals("E",marslocation.getDirection());
    }
    @Test
    public void should_return_f10W_given_00WM() {
        //given
        MarsLocation marslocationinit = new MarsLocation(0,0,"W");
        String command = "M";
        //when
        MarsRover marsrover= new MarsRover(marslocationinit);
        MarsLocation marslocation = marsrover.receive(command);

        //then
        assertEquals(-1,marslocation.getX());
        assertEquals(0,marslocation.getY());
        assertEquals("W",marslocation.getDirection());
    }
    @Test
    public void should_return_00S_given_00WL() {
        //given
        MarsLocation marslocationinit = new MarsLocation(0,0,"W");
        String command = "L";
        //when
        MarsRover marsrover= new MarsRover(marslocationinit);
        MarsLocation marslocation = marsrover.receive(command);

        //then
        assertEquals(0,marslocation.getX());
        assertEquals(0,marslocation.getY());
        assertEquals("S",marslocation.getDirection());
    }
    @Test
    public void should_return_00N_given_00WR() {
        //given
        MarsLocation marslocationinit = new MarsLocation(0,0,"W");
        String command = "R";
        //when
        MarsRover marsrover= new MarsRover(marslocationinit);
        MarsLocation marslocation = marsrover.receive(command);

        //then
        assertEquals(0,marslocation.getX());
        assertEquals(0,marslocation.getY());
        assertEquals("N",marslocation.getDirection());
    }
    @Test
    public void should_return_0f1S_given_00SM() {
        //given
        MarsLocation marslocationinit = new MarsLocation(0,0,"S");
        String command = "M";
        //when
        MarsRover marsrover= new MarsRover(marslocationinit);
        MarsLocation marslocation = marsrover.receive(command);

        //then
        assertEquals(0,marslocation.getX());
        assertEquals(-1,marslocation.getY());
        assertEquals("S",marslocation.getDirection());
    }
    @Test
    public void should_return_00E_given_00SL() {
        //given
        MarsLocation marslocationinit = new MarsLocation(0,0,"S");
        String command = "L";
        //when
        MarsRover marsrover= new MarsRover(marslocationinit);
        MarsLocation marslocation = marsrover.receive(command);

        //then
        assertEquals(0,marslocation.getX());
        assertEquals(0,marslocation.getY());
        assertEquals("E",marslocation.getDirection());
    }
    @Test
    public void should_return_00W_given_00SR() {
        //given
        MarsLocation marslocationinit = new MarsLocation(0,0,"S");
        String command = "R";
        //when
        MarsRover marsrover= new MarsRover(marslocationinit);
        MarsLocation marslocation = marsrover.receive(command);

        //then
        assertEquals(0,marslocation.getX());
        assertEquals(0,marslocation.getY());
        assertEquals("W",marslocation.getDirection());
    }
}
