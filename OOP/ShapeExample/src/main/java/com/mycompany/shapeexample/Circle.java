package com.mycompany.shapeexample;

public class Circle extends Shape {

    private int radius;

    public Circle() {
    }

    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}
