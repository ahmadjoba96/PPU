package com.mycompany.shapeengine;

public class Triangle extends Shape {

    private int base;
    private int height;

    public Triangle(String name, int base, int height) {
        super(name);
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Triangle: " + getName());
    }
}
