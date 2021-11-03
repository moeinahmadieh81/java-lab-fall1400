package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Rectangle {
    private ArrayList<Integer> sides;

    public Rectangle(int... arr) {
        sides = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sides.add(arr[i]);
        }
    }

    public ArrayList<Integer> getSides() {
        return sides;
    }

    public boolean isSquare() {
        if (sides.get(0).equals(sides.get(1))) {
            return true;
        } else {
            return false;
        }
    }

    public double calArea() {
        return sides.get(0) * sides.get(1);
    }

    public double calPerimeter() {
        return 2 * (sides.get(0) + sides.get(1));
    }

    public void draw() {
        System.out.println("Rectangle: ");
        System.out.println("sides are: ");
        printSides();
        System.out.println(calPerimeter());
        System.out.println(calArea());
    }

    public void printSides() {
        Iterator<Integer> it = sides.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(sides, rectangle.sides);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sides);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sides=" + sides + " " +
                "Area=" + calArea() + " " +
                "Perimeter=" + calPerimeter() + " " +
                '}';
    }
}
