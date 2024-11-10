package com.javatasks.arrayss;

//3.Given an integer array, find all the elements that appear twice in this array.

//Example: Input: [4,3,2,7,8,2,3,1] → Output: [2,3]

import java.util.Arrays;

public class FindDuplicates {

    public static int[] findDuplicates(int[] nums) {
        // List to store the duplicates
        int[] result = new int[nums.length];
        int index = 0; // To track the number of duplicates found
        
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            // Find the index corresponding to the value at nums[i]
            int value = Math.abs(nums[i]);
            int idx = value - 1; // index for value (1-based index adjustment)
            
            // If the number at that index is negative, it means we've seen this number before
            if (nums[idx] < 0) {
                result[index++] = value; // Store the duplicate
            } else {
                // Otherwise, negate the number at that index to mark it as visited
                nums[idx] = -nums[idx];
            }
        }
        
        // Now, we need to return the result array with only the duplicates found
        // Resize the result array to fit the actual number of duplicates found
        return Arrays.copyOf(result, index);
    }

    public static void main(String[] args) {
        // Test example
        int[] input = {4, 3, 2, 7, 8, 2, 3, 1};
        
        int[] duplicates = findDuplicates(input);
        
        // Print the duplicates
        System.out.println(Arrays.toString(duplicates));  // Output: [2, 3]
    }
}

