package com.javatasks.abstractInnerclasees;

//Create an interface Playable with a method play(). Create two classes Guitar and Piano that implement this interface.
interface Playable {
    void play();
}

class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the Guitar.");
    }
}

class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the Piano.");
    }
}

public class Main7 {
    public static void main(String[] args) {
        Playable guitar = new Guitar();
        Playable piano = new Piano();
        
        guitar.play();  // Outputs: Playing the Guitar.
        piano.play();   // Outputs: Playing the Piano.
    }
}
