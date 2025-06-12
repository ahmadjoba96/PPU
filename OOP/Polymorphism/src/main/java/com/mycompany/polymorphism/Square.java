package com.mycompany.polymorphism;

public class Square extends Rectangle {

    public Square(String name, int width) {
        super(name, width, width); 
    }

    @Override
    public double area() {
        return getWidth() * getWidth();
    }
}
