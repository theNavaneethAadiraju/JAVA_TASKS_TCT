package com.javatasks.constructoObjects;


//.Reverse a string using the StringBuffer class.

public class StringReversal {

    public static void main(String[] args) {
        
        // Original string
        String originalString = "Hello, World!";
        
        // Create a StringBuffer object and pass the original string to it
        StringBuffer stringBuffer = new StringBuffer(originalString);
        
        // Reverse the string using the reverse() method
        stringBuffer.reverse();
        
        // Convert the reversed StringBuffer back to a String and print the result
        String reversedString = stringBuffer.toString();
        System.out.println("Reversed String: " + reversedString);
    }
}

