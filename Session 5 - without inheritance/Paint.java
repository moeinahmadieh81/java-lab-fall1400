package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Paint {
    private ArrayList<Triangle> triangles;
    private ArrayList<Rectangle> rectangles;
    private ArrayList<Circle> circles;

    public Paint() {
        this.triangles = new ArrayList<>();
        this.rectangles = new ArrayList<>();
        this.circles = new ArrayList<>();
    }

    public void addTriangle(Triangle triangle) {
        triangles.add(triangle);
    }

    public void addRectangle(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    public void addCircle(Circle circle) {
        circles.add(circle);
    }

    public void drawAll() {
        Iterator<Triangle> it = triangles.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        Iterator<Rectangle> it2 = rectangles.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
        Iterator<Circle> it3 = circles.iterator();
        while (it3.hasNext()) {
            System.out.println(it3.next());
        }
    }



    public void printAll() {
        for (Triangle triangle : triangles) {
            System.out.println(triangle.toString());
        }
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle.toString());
        }
        for (Circle circle : circles) {
            System.out.println(circle.toString());
        }
    }
}
