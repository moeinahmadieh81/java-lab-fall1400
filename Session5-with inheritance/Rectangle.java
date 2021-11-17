package com.company;

import java.util.ArrayList;

/**
 * The type Rectangle.
 */
public class Rectangle extends Polygon {
    /**
     * Instantiates a new Rectangle.
     *
     * @param sides the sides
     */
    public Rectangle(int... sides) {
        super(sides[0], sides[1], sides[2], sides[3]);
    }

    @Override
    public double calPerimeter() {
        return 2 * (getSides().get(0) + getSides().get(1));
    }

    @Override
    public double calArea() {
        return getSides().get(0) * getSides().get(1);
    }

    /**
     * Is square boolean.
     *
     * @return the boolean
     */
    public boolean isSquare() {
        if (getSides().get(0).equals(getSides().get(1))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean equals(Rectangle rectangle) {
        if (rectangle.getSides().get(0).equals(getSides().get(0))
                && rectangle.getSides().get(1).equals(getSides().get(1))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void draw() {
        System.out.println("Rectangle\n" + "Perimeter = " + calPerimeter() + "\nArea =" + calArea());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "side 1 =" + getSides().get(0) + " " +
                "side 2 =" + getSides().get(1) + " " +
                "side 3 =" + getSides().get(2) + " " +
                "side 4 =" + getSides().get(3) + " " +
                "}";
    }


    @Override
    public boolean equals(Triangle triangle) {
        return false;
    }

    @Override
    public boolean equals(Circle circle) {
        return false;
    }
}
