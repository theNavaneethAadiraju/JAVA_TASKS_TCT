package com.javatasks.abstractInnerclasees;
//Define an interface SmartDevice with a default method connect() that prints "Device is connecting". Also, include a static method status() that prints the device's current status (e.g., "Device is online"). Create a class SmartPhone that implements the SmartDevice interface and overrides the connect() method to print a custom message

interface SmartDevice {
    // Default method
    default void connect() {
        System.out.println("Device is not connecting...");
    }
    
    // Static method
    static void status() {
        System.out.println("Device is not  online.");
    }
}

class SmartPhone implements SmartDevice {
    // Overriding the default method
    @Override
    public void connect() {
        System.out.println("Smartphone is not  connecting to WiFi.");
    }
}

public class Main11 {
    public static void main(String[] args) {
        
        SmartDevice.status(); 

        SmartPhone phone = new SmartPhone();
        phone.connect();
    }
}
