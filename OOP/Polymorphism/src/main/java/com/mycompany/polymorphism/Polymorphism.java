//Course OOP - PPU - Dr. Mohammed Jabari
//BY:A7mad_Joba

package com.mycompany.polymorphism;

public class Polymorphism {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[4];

        shapes[0] = new Rectangle("Rec1", 3, 4);
        shapes[1] = new Circle("Circle1", 4);
        shapes[2] = new Triangle("Tri1", 6, 4);
        shapes[3] = new Square("Square1", 5);

        System.out.println("=== Shape Areas ===");
        for (Shape s : shapes) {
            System.out.println(s.getName() + " area: " + s.area());
        }

    }
}
