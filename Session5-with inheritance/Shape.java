package com.company;


/**
 * The type Shape.
 */
public abstract class Shape extends Paint {

    /**
     * Calculate the Perimeter
     *
     * @return the double
     */
    public abstract double calPerimeter();

    /**
     * calculate the Area
     *
     * @return the double
     */
    public abstract double calArea();

    /**
     * Draw print shape's identity
     */
    public abstract void draw();
    public abstract String toString();

    /**
     *checks that our shape is rectangle or not
     *
     * @param rectangle the rectangle
     * @return the boolean
     */
    public abstract boolean equals(Rectangle rectangle);

    /**
     *
     *checks that our shape is triangle or not
     * @param triangle the triangle
     * @return the boolean
     */
    public abstract boolean equals(Triangle triangle);

    /**
     *
     *checks that our shape is circle or not
     * @param circle the circle
     * @return the boolean
     */
    public abstract boolean equals(Circle circle);
}
