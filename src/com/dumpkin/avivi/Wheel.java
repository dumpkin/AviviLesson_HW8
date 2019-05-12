

package com.dumpkin.avivi;

public class Wheel {

    //for example winter, summer, allseasons
    private String season;

    //radius of wheel
    private int diameter;

    public Wheel(String season, int diameter) {
        this.season = season;
        this.diameter = diameter;
    }

    public String getSeason() {
        return season;
    }

    public int getDiameter() {
        return diameter;
    }


    @Override
    public String toString() {
        return  season +" Wheels R" + diameter +"\n";
    }
}
