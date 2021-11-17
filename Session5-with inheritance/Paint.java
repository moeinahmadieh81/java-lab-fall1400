package com.company;

import java.util.ArrayList;

/**
 * The type Paint.
 */
public class Paint {
    /**
     * The Shapes.
     */
    ArrayList<Shape> shapes;

    /**
     * Instantiates a new Paint.
     */
    public Paint() {
        this.shapes = new ArrayList<>();
    }

    /**
     * Add shape.
     *
     * @param shape the shape
     */
    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }

    /**
     * Draw all.
     * checks the dynamic part of a object and base on that prints object's identities
     */
    public void drawAll() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                System.out.println("circle:" +
                        "\nperimeter is: " + (shapes.get(i)).calPerimeter() +
                        "\narea is: " + (shapes.get(i)).calArea());
            } else if (shapes.get(i) instanceof Triangle) {
                (shapes.get(i)).draw();
            } else if (shapes.get(i) instanceof Rectangle) {
                shapes.get(i).draw();
            }

        }
    }

    /**
     * Print all.
     * checks th dynamic part of object also by using toString method prints its identities
     */
    public void printAll() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                System.out.println(shapes.get(i).toString());
            } else if (shapes.get(i) instanceof Triangle) {
                System.out.println(shapes.get(i).toString());

            } else if (shapes.get(i) instanceof Rectangle) {
                System.out.println(shapes.get(i).toString());
            }
        }
    }
}
