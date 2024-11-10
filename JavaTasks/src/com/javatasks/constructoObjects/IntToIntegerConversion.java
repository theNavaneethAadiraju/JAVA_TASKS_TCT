package com.javatasks.constructoObjects;

//Convert a primitive int value to its wrapper class Integer and print the result.

public class IntToIntegerConversion {

    public static void main(String[] args) {
        
        // Primitive int value
        int num = 42;  // A primitive int value

        // Method 1: Autoboxing (Java automatically converts primitive to wrapper class)
        Integer integerValue1 = num;  // Autoboxing - primitive int to Integer object
        System.out.println("Autoboxed Integer value: " + integerValue1);  // Print the result

        // Method 2: Explicit conversion using Integer.valueOf()
        Integer integerValue2 = Integer.valueOf(num);  // Explicit conversion
        System.out.println("Integer value using Integer.valueOf(): " + integerValue2);  // Print the result
    }
}

