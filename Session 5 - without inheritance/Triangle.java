package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Triangle {
    private ArrayList<Integer> sides;

    public Triangle(int... arr) {
        sides = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            sides.add(arr[i]);
        }
    }

    public ArrayList<Integer> getSides() {
        return sides;
    }

    public boolean isEquilateral() {
        if (sides.get(0).equals(sides.get(1)) && sides.get(0).equals(sides.get(2)) && sides.get(1).equals(sides.get(2))) {
            return true;
        } else {
            return false;
        }
    }

    public double calArea() {
        double p = calPerimeter();
        double area = Math.pow(p * (p - sides.get(0)) * (p - sides.get(1)) * (p - sides.get(2)), 0.5);
        return area;
    }

    public double calPerimeter() {
        return sides.get(0) + sides.get(1) + sides.get(2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(sides, triangle.sides);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sides);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sides=" + sides + " " +
                "Area=" + calArea() + " " +
                "Perimeter=" + calPerimeter() + " " +
                '}';
    }
}
