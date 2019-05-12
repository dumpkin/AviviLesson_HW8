// Body class describe color and body configuration

package com.dumpkin.avivi;

public class Body {

    //sedan, cabriolet, hatchback etc.
    private String bodyType;

    //any color in a visible spectre (use https://www.pantone.com)
    private String color;

    public Body(String bodyType, String color) {
        this.bodyType = bodyType;
        this.color = color;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return color + " " + bodyType + '\n';
    }
}
