package com.company;

/**
 * The type Triangle.
 */
public class Triangle extends Polygon {
    /**
     * Instantiates a new Triangle.
     *
     * @param sides the sides
     */
    public Triangle(int... sides) {
        super(sides[0], sides[1], sides[2]);
    }

    @Override
    public double calPerimeter() {
        return getSides().get(0) + getSides().get(1) + getSides().get(2);
    }

    @Override
    public double calArea() {
        double p = calPerimeter() / 2;
        return Math.pow(p * (p - getSides().get(0) * (p - getSides().get(1) * (p - getSides().get(2)))), 0.5);
    }

    /**
     * Is equilateral boolean.
     *
     * @return the boolean
     */
    public boolean isEquilateral() {
        if (getSides().get(0).equals(getSides().get(1))
                && getSides().get(0).equals(getSides().get(2))
                && getSides().get(1).equals(getSides().get(2))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean equals(Triangle triangle) {
        if (triangle.getSides().get(0).equals(getSides().get(0))
                && triangle.getSides().get(1).equals(getSides().get(1))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void draw() {
        System.out.println("Triangle\n" + "Perimeter = " + calPerimeter() + "\nArea =" + calArea());
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side 1 =" + getSides().get(0) + " " +
                "side 2 =" + getSides().get(1) + " " +
                "side 3 =" + getSides().get(2) + " " +
                "}";
    }

    @Override
    public boolean equals(Rectangle rectangle) {
        return false;
    }

    @Override
    public boolean equals(Circle circle) {
        return false;
    }
}
