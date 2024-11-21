package com.javatasks.abstractInnerclasees;

//9. Define an interface Device with a default method turnOn(), which prints a message that the device is turning on. Then, create a class TV that implements the Device interface and does not override turnOn(). Create another class Radio that overrides the turnOn() method.

interface Device {
    // Default method in an interface
    default void turnOn() {
        System.out.println("The device is turning on.");
    }
}

class TV implements Device {
    // TV uses the default method without overriding it
}

class Radio implements Device {
    // Radio overrides the default method
    @Override
    public void turnOn() {
        System.out.println("The radio is turning on with a beep.");
    }
}

public class Main9 {
    public static void main(String[] args) {
        Device tv = new TV();
        Device radio = new Radio();

        tv.turnOn();   // Outputs: The device is turning on.
        radio.turnOn(); // Outputs: The radio is turning on with a beep.
    }
}
