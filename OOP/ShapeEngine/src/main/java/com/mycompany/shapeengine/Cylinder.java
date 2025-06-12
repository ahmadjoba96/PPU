package com.mycompany.shapeengine;

public class Cylinder extends Circle {

    private int height;

    public Cylinder(String name, int radius, int height) {
        super(name, radius);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double area() {
        int r = getRadius();
        return (2 * Math.PI * r * r) + (2 * Math.PI * r * height);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Cylinder: " + getName());
    }
}
