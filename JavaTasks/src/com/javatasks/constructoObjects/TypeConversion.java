package com.javatasks.constructoObjects;


// 3. Convert a string "123" to an integer and print the result
//4.Convert a double value 15.75 to a string and print it.

public class TypeConversion {

    public static void main(String[] args) {
        
        // Task 1: Convert a string "123" to an integer and print the result
        String str = "123";  // A string containing a number
        int number = Integer.parseInt(str);  // Convert the string to an integer
        System.out.println("Converted String to Integer: " + number);  // Print the result

        // Task 2: Convert a double value 15.75 to a string and print it
        double decimalValue = 15.75;  // A double value
        String strValue = Double.toString(decimalValue);  // Convert the double to a string
        System.out.println("Converted Double to String: " + strValue);  // Print the result
    }
}
