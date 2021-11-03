package com.company;

import java.math.*;
import java.util.Objects;

public class Circle {
    private int radius;


    public Circle(int radius) {
        this.radius = radius;
    }

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
        System.out.println("Circle: ");
        System.out.println(calArea());
        System.out.println(calPerimeter());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + " " +
                "Area= " + calArea() + " " +
                "Perimeter=" + calPerimeter() + " " +
                '}';
    }
}
