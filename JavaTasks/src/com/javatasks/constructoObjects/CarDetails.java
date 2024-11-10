package com.javatasks.constructoObjects;

// 1.Define a class Car with attributes brand and price. Create an object of the class and print its details.

//Define the Car class
class Car {
 // Attributes of the Car class
 String brand;   // Brand of the car
 double price;   // Price of the car

 // Method to display the details of the car
 void displayDetails() {
     // Printing the details of the car
     System.out.println("Car Brand: " + brand);
     System.out.println("Car Price: $" + price);
 }
}

//Define a new class to run the program
public class CarDetails {
 public static void main(String[] args) {
     // Creating an object of the Car class
     Car myCar = new Car();  // Creating a new instance of the Car class

     // Setting values for the attributes of the Car object
     myCar.brand = "Toyota";    // Set brand to "Toyota"
     myCar.price = 25000.00;    // Set price to 25000.00

     // Calling the method to display the details of the car
     myCar.displayDetails();  // Display the details of myCar
 }
}

