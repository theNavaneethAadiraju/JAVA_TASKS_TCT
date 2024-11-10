package com.javatasks.constructoObjects;

// 2.Create a method addNumbers(int a, int b) to add two numbers and return the result.

//Define a class with a method to add two numbers
class Calculator {

 // Method to add two numbers and return the result
 int addNumbers(int a, int b) {
     return a + b;  // Return the sum of a and b
 }
}

//Main class to test the addNumbers method
public class AddNumbersTest {
 public static void main(String[] args) {
     // Create an object of the Calculator class
     Calculator calculator = new Calculator();
     
     // Call the addNumbers method and store the result
     int result = calculator.addNumbers(10, 20);  // Adding 10 and 20
     
     // Print the result
     System.out.println("The sum of 10 and 20 is: " + result);  // Output: 30
 }
}

