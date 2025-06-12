package com.mycompany.shapeexample;

public class Square extends Rectangle {

    public Square(String name, int width) {
        super(name, width, width); 
    }

    @Override
    public int area() {
        return getWidth() * getWidth();
    }
}
