package com.javatasks.abstractInnerclasees;
//4.Create an abstract class Shape with an abstract method area(). Then create two non-abstract subclasses Circle and Rectangle, which calculate the area of their respective shapes.
abstract class Shape {
    // Abstract method
    abstract double area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

public class Main4 {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Area of Circle: " + circle.area()); // Outputs: Area of Circle: 78.53981633974483
        System.out.println("Area of Rectangle: " + rectangle.area()); // Outputs: Area of Rectangle: 24.0
    }
}

