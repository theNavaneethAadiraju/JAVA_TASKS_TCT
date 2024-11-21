package com.javatasks.abstractInnerclasees;
interface Movable {
    void move();
}

class Carr implements Movable {
    @Override
    public void move() {
        System.out.println("The car is moving.");
    }
}

class Person implements Movable {
    @Override
    public void move() {
        System.out.println("The person is walking.");
    }
}

public class Main6 {
    public static void main(String[] args) {
        Movable car = new Carr();
        Movable person = new Person();
        
        car.move();    // Outputs: The car is moving.
        person.move(); // Outputs: The person is walking.
    }
}

