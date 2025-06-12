package com.mycompany.polymorphism;

public class Cylinder extends Circle {

    private int height;

    public Cylinder() {
    }

    public Cylinder(String name, int radius, int height) {
        super(name, radius);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double area() {
        int r = getRadius();
        return (2 * Math.PI * r * r) + (2 * Math.PI * r * height);
    }
}
