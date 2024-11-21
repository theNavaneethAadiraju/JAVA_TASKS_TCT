package com.javatasks.abstractInnerclasees;

//Abstract class Animal
abstract class Animall {

 // Abstract method makeSound(), to be implemented by subclasses
 public abstract void makeSound();

 // Non-abstract method eat(), which is inherited by subclasses
 public void eat() {
     System.out.println("This animal is eating.");
 }
}

//Dog class extends Animal and implements makeSound()
class Dog extends Animall {

 @Override
 public void makeSound() {
     System.out.println("Woof");
 }
}

//Cat class extends Animal and implements makeSound()
class Cat extends Animall {

 @Override
 public void makeSound() {
     System.out.println("Meow");
 }
}

public class Main3 {

 public static void main(String[] args) {
     // Creating objects of Dog and Cat
	 Animall dog = new Dog();
	 Animall cat = new Cat();

     // Calling methods on Dog object
     dog.makeSound();  // Outputs: Woof
     dog.eat();        // Outputs: This animal is eating.

     // Calling methods on Cat object
     cat.makeSound();  // Outputs: Meow
     cat.eat();        // Outputs: This animal is eating.
 }
}

