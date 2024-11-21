package com.javatasks.abstractInnerclasees;
//1.Create an outer class Outer with an inner class Inner that prints a message. In the main method, instantiate the Outer class and then create an instance of the Inner class to display the message
class Outer {
    // Inner class
    class Inner {
        void printMessage() {
            System.out.println("Hello from the inner class!");
        }
    }

    void createInnerClassInstance() {
        // Creating instance of Inner class inside Outer
        Inner inner = new Inner();
        inner.printMessage();
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer(); // Create Outer class object
        outer.createInnerClassInstance(); // Access Inner class via Outer
    }
}

