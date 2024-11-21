package com.javatasks.abstractInnerclasees;
//Define an interface Calculator with a static method add() that adds two numbers. Then, use the static method in the Main class.

interface Calculator {
    // Static method
    static int add(int a, int b) {
        return a + b;
    }
}

public class Main10 {
    public static void main(String[] args) {
        // Calling the static method directly from the interface
        int sum = Calculator.add(5, 3);
        System.out.println("Sum: " + sum);  // Outputs: Sum: 8
    }
}

