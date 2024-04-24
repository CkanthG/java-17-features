package org.sree.java.features.sealedclasses;

public sealed interface Shape permits Circle, Rectangle {
    double area();
}

final class Rectangle implements Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        Circle circle = new Circle(10);
        printShapeArea(circle);
        printShapeArea(rectangle);
    }

    public static void printShapeArea(Shape shape) {
        if (shape instanceof Circle c) {
            System.out.println("Area of Circle with radius " + c.getRadius() + ": " + c.area());
        } else if (shape instanceof Rectangle r) {
            System.out.println("Area of Rectangle with length " + r.length + " and width " + r.width + ": " + r.area());
        } else {
            System.out.println("Unknown shape");
        }
    }
}

final class Circle implements Shape {
    private final double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}


