package com.javatasks.inheritance;
//1.Create a Person class with attributes name and age. Then, create a Student class that inherits from Person. 
//Add an attribute studentId in the Student class. Write a program to create an object of Student, set its attributes, and display the information.

//Define the Person class
class Person {
 // Declare attributes for the Person class
 String name;  // To store the name of the person
 int age;      // To store the age of the person
}

//Define the Student class which inherits from Person
class Student extends Person {
 // Declare additional attribute for the Student class
 String studentId;  // To store the student ID

 // Method to display information about the student
 void displayInfo() {
     // Print the student's information
     System.out.println("Name: " + name);       // Accessing the inherited 'name' attribute from Person class
     System.out.println("Age: " + age);         // Accessing the inherited 'age' attribute from Person class
     System.out.println("Student ID: " + studentId);  // Accessing 'studentId' attribute from Student class
 }
}

public class Main {
 public static void main(String[] args) {
     // Create an object of the Student class
     Student student = new Student();  // student is an instance of the Student class

     // Set values for the attributes of the Student object
     student.name = "John Doe";     // Assigning a name to the student
     student.age = 20;              // Assigning an age to the student
     student.studentId = "S12345";  // Assigning a student ID to the student

     // Call the displayInfo method to print the student's information
     student.displayInfo();  // This will print the details of the student
 }
}

