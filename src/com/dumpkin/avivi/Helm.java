//Wheel class have a one field with direction

package com.dumpkin.avivi;

public class Helm {

    //LEFT or RIGHT
    private Direction wheelDirection;

    public Helm(Direction wheelDirection) {
        this.wheelDirection = wheelDirection;
    }

    public Direction getWheelDirection() {
        return wheelDirection;
    }

    @Override
    public String toString() {
        return  wheelDirection +" direction helm \n";
    }
}
