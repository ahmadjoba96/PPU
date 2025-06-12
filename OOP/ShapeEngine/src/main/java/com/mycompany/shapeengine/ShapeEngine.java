//Course OOP - PPU - Dr. Mohammed Jabari
//BY:A7mad_Joba 

package com.mycompany.shapeengine;

import java.util.ArrayList;

public class ShapeEngine {

    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle("Rec1", 3, 4));
        shapes.add(new Circle("Circle1", 4));
        shapes.add(new Triangle("Tri1", 6, 4));
        shapes.add(new Square("Square1", 5));
        shapes.add(new Cylinder("Cyl1", 3, 7));

        System.out.println("Shape drawing and area calculation ");
        for (Shape s : shapes) {
            s.draw();
            System.out.println(s.getName() + " Area: " + s.area());

            if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                System.out.println("This is a Rectangle with width = " + r.getWidth());
            }

            if (s instanceof Cylinder) {
                Cylinder c = (Cylinder) s;
                System.out.println("This is a Cylinder with height = " + c.getHeight());
            }

            System.out.println("---------------------------");
        }

    }
}
