package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(19);
        Circle circle2 = new Circle(3);

        Rectangle rectangle = new Rectangle(1, 4, 1, 4);
        Rectangle rectangle2 = new Rectangle(8,5,8,5);
        Rectangle rectangle3 = new Rectangle(6,6,6,6);

        Triangle tri1 = new Triangle(2,2,2);
        Triangle tri2 = new Triangle(4,4,6);

        Paint paint = new Paint();

        paint.addCircle(circle);
        paint.addCircle(circle2);
        paint.addRectangle(rectangle);
        paint.addRectangle(rectangle2);
        paint.addRectangle(rectangle3);
        paint.addTriangle(tri1);
        paint.addTriangle(tri2);

        paint.drawAll();
        System.out.println("---------------------------");
        paint.printAll();
    }
}
