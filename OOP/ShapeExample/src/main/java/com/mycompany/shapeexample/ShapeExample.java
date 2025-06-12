//Course OOP - PPU - Dr. Mohammed Jabari
//BY:A7mad_Joba

package com.mycompany.shapeexample;

public class ShapeExample {

    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 5);
        Rectangle rectangle = new Rectangle("Rectangle", 4, 6);
        Square square = new Square("Square", 4);
        Cylinder cylinder = new Cylinder("Cylinder", 3, 7);

        System.out.println(circle.getName() + " area: " + circle.area());
        System.out.println(rectangle.getName() + " area: " + rectangle.area());
        System.out.println(square.getName() + " area: " + square.area());
        System.out.println(cylinder.getName() + " area: " + cylinder.area());

    }
}
