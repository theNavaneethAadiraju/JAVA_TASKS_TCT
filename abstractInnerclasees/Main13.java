package com.javatasks.abstractInnerclasees;
//Create an abstract class Shape with an abstract method area(). In the Main class, create anonymous inner classes that implement the Shape class for Circle and Rectangle, and calculate and print their areas.

abstract class Shapee {
    abstract double area();
}

public class Main13 {
    public static void main(String[] args) {
        // Anonymous inner class for Circle
    	Shapee circle = new Shapee() {
            double radius = 5.0;

            @Override
            double area() {
                return Math.PI * radius * radius;
            }
        };

        // Anonymous inner class for Rectangle
        Shapee rectangle = new Shapee() {
            double length = 4.0;
            double width = 6.0;

            @Override
            double area() {
                return length * width;
            }
        };

        System.out.println("Area of Circle: " + circle.area());     // Outputs: Area of Circle: 78.53981633974483
        System.out.println("Area of Rectangle: " + rectangle.area()); // Outputs: Area of Rectangle: 24.0
    }
}

