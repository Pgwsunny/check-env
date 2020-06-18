package com.twschool.practice;

public class MarsRover {
    private MarsLocation marslocation;
    public MarsRover(MarsLocation marslocation) {
        this.marslocation = marslocation;
    }

    public MarsLocation getLocation() {
        return marslocation;
    }

    public MarsLocation receive(String command) {
        if(marslocation.getDirection().equals("N")){
            if (command.equals("M") ){
                marslocation.setY(marslocation.getY()+1);
                //return marslocation;
            }
            if (command.equals("L") ){
                marslocation.setDirection("W");
                //return marslocation;
            }
            if (command.equals("R") ){
                marslocation.setDirection("E");
                //return marslocation;
            }
        }
        return marslocation;
    }
}
