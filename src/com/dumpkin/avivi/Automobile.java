//all you need to build your own car


package com.dumpkin.avivi;

public class Automobile {
    private String enginetype;
    private String brand;

    private Wheel wheel;
    private Helm helm;
    private Body body;

    public Automobile(String enginetype, String brand, Wheel wheel, Helm helm, Body body) {
        this.enginetype = enginetype;
        this.brand = brand;
        setBody(body);
        setHelm(helm);
        setWheel(wheel);
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Hot SALE!!!\n" +
                "ONLY THIS WEEKAND!!!\n" +
                "Supercar "+ brand +
                " with " + enginetype + "engine\n" +
                 wheel.toString() +
                "Has a " + helm.toString() +
                "Beautiful " + body.toString() +
                "Don't miss this Chance!!";
    }
}
