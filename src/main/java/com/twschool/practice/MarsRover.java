package com.twschool.practice;

public class MarsRover {
    private MarsLocation marslocation;
    public MarsRover(MarsLocation marslocation) {
        this.marslocation = marslocation;
    }


    public MarsLocation getLocation() {
        return marslocation;
    }
}
