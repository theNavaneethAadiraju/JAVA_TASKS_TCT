package com.javatasks.arrayss;
//1.Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one number that is missing from the array.

//Example: Input: [3, 0, 1] → Output: 2

public class MissingNumber {

    // Function to find the missing number
    public static int findMissingNumber(int[] nums) {
        int n = nums.length;  // The length of the array is 'n', and the array contains n distinct numbers from 0 to n

        // Calculate the expected sum of numbers from 0 to n using the formula n*(n+1)/2
        int expectedSum = n * (n + 1) / 2;

        // Initialize the actual sum variable to 0
        int actualSum = 0;

        // Loop through the array and sum all the elements
        for (int num : nums) {
            actualSum += num;  // Add each number from the array to actualSum
        }

        // The missing number is the difference between expectedSum and actualSum
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {3, 0, 1};  // Array with distinct numbers from 0 to 3, missing 2

        // Call the function to find the missing number
        int missingNumber = findMissingNumber(nums);

        // Output the missing number
        System.out.println("The missing number is: " + missingNumber);  // Output will be 2
    }
}

