package com.javatasks.abstractInnerclasees;
//2.Create an abstract class Animal with an abstract method sound(). In the Main class, create an anonymous inner class that extends Animal and provides an implementation for the sound() method. Print the sound of the animal.
abstract class Animal {
    abstract void sound();
}

public class Main2 {
    public static void main(String[] args) {
        // Anonymous inner class extending Animal
        Animal dog = new Animal() {
            @Override
            void sound() {
                System.out.println("Bark!");
            }
        };

        Animal cat = new Animal() {
            @Override
            void sound() {
                System.out.println("Meow!");
            }
        };

        dog.sound();  // Outputs: Bark!
        cat.sound();  // Outputs: Meow!
    }
}

