package com.javatasks.inheritance;
//3.Create a class Animal with attributes name and species. Create a subclass Bird that adds the attribute wingSpan, and then a further subclass Parrot that adds vocabularyCount.
//Write a program to create an object of Parrot, set values to all attributes, and display the information.



//Define the Animal class (Parent class)
class Animal {
 // Declare attributes for the Animal class
 String name;    // Name of the animal
 String species; // Species of the animal
}

//Define the Bird class which inherits from Animal
class Bird extends Animal {
 // Declare an additional attribute specific to birds
 double wingSpan;  // Wingspan of the bird in meters

 // Method to display information about the bird
 void displayBirdInfo() {
     System.out.println("Name: " + name);      // Access 'name' from Animal class
     System.out.println("Species: " + species); // Access 'species' from Animal class
     System.out.println("Wingspan: " + wingSpan + " meters"); // Access 'wingSpan' from Bird class
 }
}

//Define the Parrot class which inherits from Bird
class Parrot extends Bird {
 // Declare an additional attribute specific to parrots
 int vocabularyCount;  // The number of words the parrot can say

 // Method to display information about the parrot
 void displayParrotInfo() {
     // Calling the displayBirdInfo method from Bird class
     displayBirdInfo();   // This will display the information from the Bird and Animal classes
     System.out.println("Vocabulary Count: " + vocabularyCount);  // Access 'vocabularyCount' from Parrot class
 }
}

public class Main3 {
 public static void main(String[] args) {
     // Create an object of the Parrot class
     Parrot parrot = new Parrot();

     // Set values to the attributes inherited from Animal and Bird classes
     parrot.name = "Polly";         // Set the name of the parrot
     parrot.species = "African Grey"; // Set the species of the parrot
     parrot.wingSpan = 0.9;         // Set the wingspan of the parrot (in meters)
     parrot.vocabularyCount = 150;  // Set the number of words the parrot can say

     // Call the displayParrotInfo method to print the parrot's information
     parrot.displayParrotInfo();    // Display all the information related to the parrot
 }
}

