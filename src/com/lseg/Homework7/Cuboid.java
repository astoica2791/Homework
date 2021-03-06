package com.lseg.Homework7;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double height, double width, double length) {
        super(width, length);
        if (height < 0) {
            height = 0;
        }
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return height * getWidth() * getLength();
    }
}