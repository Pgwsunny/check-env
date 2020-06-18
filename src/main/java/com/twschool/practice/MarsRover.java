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
        if(marslocation.getDirection().equals("W")){
            if (command.equals("M") ){
                marslocation.setX(marslocation.getX()-1);
                //return marslocation;
            }
            if (command.equals("L") ){
                marslocation.setDirection("S");
                //return marslocation;
            }
            if (command.equals("R") ){
                marslocation.setDirection("N");
                //return marslocation;
            }
        }
        if(marslocation.getDirection().equals("S")) {
            if (command.equals("M")) {
                marslocation.setY(marslocation.getY() - 1);
                //return marslocation;
            }
            if (command.equals("L")) {
                marslocation.setDirection("E");
                //return marslocation;
            }
            if (command.equals("R")) {
                marslocation.setDirection("W");
                //return marslocation;
            }
        }
        return marslocation;
    }
}
