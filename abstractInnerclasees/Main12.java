package com.javatasks.abstractInnerclasees;
//Create an interface MediaPlayer with a default method play() that prints "Playing media". Also, include a static method stop() that prints "Stopping media". Then, create a class MP3Player that implements the MediaPlayer interface and overrides the play() method to print a custom message.

interface MediaPlayer {
    // Default method
    default void play() {
        System.out.println("Playing media");
    }
    
    // Static method
    static void stop() {
        System.out.println("Stopping media");
    }
}

class MP3Player implements MediaPlayer {
    // Overriding the default method
    @Override
    public void play() {
        System.out.println("MP3 Player is playing music.");
    }
}

public class Main12 {
    public static void main(String[] args) {
        // Calling static method from the interface
        MediaPlayer.stop();  // Outputs: Stopping media.

        MP3Player mp3Player = new MP3Player();
        mp3Player.play();    // Outputs: MP3 Player is playing music.
    }
}

