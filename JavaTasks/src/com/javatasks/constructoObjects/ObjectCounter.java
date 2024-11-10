package com.javatasks.constructoObjects;

//Define a static variable to count the number of objects created from a class.

public class ObjectCounter {

    // Static variable to count the number of objects created
    static int count = 0;  // This will hold the number of objects created

    // Constructor of the class
    public ObjectCounter() {
        // Every time an object is created, we increment the count
        count++;
    }

    // Static method to get the current count of objects created
    public static int getObjectCount() {
        return count;  // Return the count of objects
    }

    public static void main(String[] args) {
        // Creating objects of the ObjectCounter class
        ObjectCounter obj1 = new ObjectCounter();  // First object
        ObjectCounter obj2 = new ObjectCounter();  // Second object
        ObjectCounter obj3 = new ObjectCounter();  // Third object

        // Printing the count of objects created
        System.out.println("Number of objects created: " + ObjectCounter.getObjectCount());
    }
}

