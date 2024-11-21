package com.javatasks.abstractInnerclasees;
//8.Create an interface Chargeable with a method charge(). Then create a class Phone that implements this interface.
interface Chargeable {
    void charge();
}

class Phone implements Chargeable {
    @Override
    public void charge() {
        System.out.println("Charging the phone.");
    }
}

public class Main8 {
    public static void main(String[] args) {
        Chargeable phone = new Phone();
        phone.charge();  // Outputs: Charging the phone.
    }
}

