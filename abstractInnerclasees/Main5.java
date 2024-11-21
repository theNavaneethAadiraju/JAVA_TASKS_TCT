package com.javatasks.abstractInnerclasees;
//5.Create an abstract class Vehicle with a method speed() that should be implemented by subclasses Car and Bike.
abstract class Vehicle {
    abstract void speed();
}

class Car extends Vehicle {
    @Override
    void speed() {
        System.out.println("Car speed is 100 km/h");
    }
}

class Bike extends Vehicle {
    @Override
    void speed() {
        System.out.println("Bike speed is 50 km/h");
    }
}

public class Main5 {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();
        
        myCar.speed(); // Outputs: Car speed is 100 km/h
        myBike.speed(); // Outputs: Bike speed is 50 km/h
    }
}
