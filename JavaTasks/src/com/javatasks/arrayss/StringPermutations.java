package com.javatasks.arrayss;

public class StringPermutations {

    public static void main(String[] args) {
        // Input string
        String input = "abc";  // Example input, we want to generate all permutations of "abc"
        
        // Calculate the number of permutations and create an array to store the results
        String[] result = new String[factorial(input.length())];  // Create an array of size n! to store all permutations
        
        // We pass the string as a char array, starting index 0, and result array to store permutations
        permute(input.toCharArray(), 0, result, new int[1]);  // The last argument is used to keep track of the current index in the result array
        
        // Print each permutation stored in the result array
        for (String permutation : result) {
            System.out.println(permutation);  // Print each permutation generated
        }
    }

    // Function to calculate the factorial of a number 'n' (i.e., n!)
    // This helps to determine how many permutations there will be
    private static int factorial(int n) {
        int result = 1;  // Start with 1, and multiply by each number up to 'n'
        
        // Multiply each number from 1 to n to compute n!
        for (int i = 1; i <= n; i++) {
            result *= i;  // Multiply 'result' by the current number 'i'
        }
        
        return result;  // Return the computed factorial value
    }

    // Recursive function to generate permutations of the input string
    private static void permute(char[] arr, int index, String[] result, int[] currentIndex) {
        // Base case: If the 'index' is equal to the length of the array, we've generated a full permutation
        if (index == arr.length) {
            result[currentIndex[0]] = new String(arr);  // Convert the char array to a String and store it in the result array
            currentIndex[0]++;  // Increment the index for the next permutation
            return;  // Return as we have found a valid permutation
        }

        // Recursive case: Loop through each character from 'index' to the end of the array
        for (int i = index; i < arr.length; i++) {
            // Swap characters at 'index' and 'i' to create a new permutation
            swap(arr, index, i);
            
            // Recursively generate the next permutation by moving to the next index
            permute(arr, index + 1, result, currentIndex);
            
            // Backtrack: After recursion, swap the characters back to their original positions
            swap(arr, index, i);
        }
    }

    // Helper function to swap two characters in the array
    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];  // Store the character at index 'i' in a temporary variable
        arr[i] = arr[j];  // Move the character at index 'j' to index 'i'
        arr[j] = temp;  // Set the character at index 'i' to the temporary value (originally from 'j')
    }
}

