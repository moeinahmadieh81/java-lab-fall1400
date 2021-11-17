package com.company;

/**
 * The type Circle.
 */
public class Circle extends Shape {
    private int radius;

    /**
     * Instantiates a new Circle.
     *
     * @param radius the radius
     */
    public Circle(int radius) {
        this.radius = radius;
    }

    /**
     * Gets radius.
     *
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }

    public double calPerimeter() {
        return 2 * radius * Math.PI;
    }


    public double calArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public void draw() {
        System.out.println("Circle\nRadius =" + radius + "\nArea = " + calArea() + "\nPerimeter = " + calPerimeter());
    }

    public boolean equals(Circle circle){
        return circle.radius == radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + " " +
                '}';
    }

    @Override
    public boolean equals(Rectangle rectangle) {
        return false;
    }

    @Override
    public boolean equals(Triangle triangle) {
        return false;
    }
}