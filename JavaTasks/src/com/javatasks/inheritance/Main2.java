package com.javatasks.inheritance;
//2.Implement hierarchical inheritance where there is a Vehicle class with brand and year. Then create Car and Bike classes inheriting Vehicle. Both classes should have their specific attribute (model for Car and type for Bike). 
//Write a program to display information for both a Car and a Bike.



//Define the Vehicle class (Parent class)
class Vehicle {
 // Declare attributes for the Vehicle class
 String brand;  // To store the brand of the vehicle
 int year;      // To store the manufacturing year of the vehicle
}

//Define the Car class which inherits from Vehicle
class Car extends Vehicle {
 // Declare additional attribute for the Car class
 String model;  // To store the model of the car

 // Method to display information about the car
 void displayCarInfo() {
     System.out.println("Brand: " + brand);     // Accessing 'brand' from the Vehicle class
     System.out.println("Year: " + year);       // Accessing 'year' from the Vehicle class
     System.out.println("Model: " + model);     // Accessing 'model' from the Car class
 }
}

//Define the Bike class which inherits from Vehicle
class Bike extends Vehicle {
 // Declare additional attribute for the Bike class
 String type;  // To store the type of the bike (e.g., mountain, road, etc.)

 // Method to display information about the bike
 void displayBikeInfo() {
     System.out.println("Brand: " + brand);     // Accessing 'brand' from the Vehicle class
     System.out.println("Year: " + year);       // Accessing 'year' from the Vehicle class
     System.out.println("Type: " + type);       // Accessing 'type' from the Bike class
 }
}

public class Main2 {
 public static void main(String[] args) {
     // Create an object of the Car class
     Car car = new Car();
     car.brand = "Toyota";      // Set brand for the car
     car.year = 2022;           // Set manufacturing year for the car
     car.model = "Corolla";     // Set model for the car

     // Create an object of the Bike class
     Bike bike = new Bike();
     bike.brand = "Trek";       // Set brand for the bike
     bike.year = 2021;          // Set manufacturing year for the bike
     bike.type = "Mountain";    // Set type for the bike

     // Call the displayCarInfo method to print car details
     System.out.println("Car Information:");
     car.displayCarInfo();  // Display car information

     // Add a separator line for clarity
     System.out.println("-------------------------");

     // Call the displayBikeInfo method to print bike details
     System.out.println("Bike Information:");
     bike.displayBikeInfo();  // Display bike information
 }
}

