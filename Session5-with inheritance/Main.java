package com.company;

public class Main {

    public static void main(String[] args) {


        Circle circle = new Circle(5);
        Circle circle1 = new Circle(6);
        Triangle triangle = new Triangle(3, 4, 5);
        Rectangle rectangle=new Rectangle(2 ,3,2,3);
        Paint paint1 = new Paint();

        paint1.addShape(circle);
        paint1.addShape(circle1);
        paint1.addShape(triangle);
        paint1.addShape(rectangle);
        paint1.drawAll();

        paint1.printAll();

    }

}

