package com.javatasks.arrayss;


//2.Given an array of integers, return indices of the two numbers such that they add up to a specific target.

//Example: Input: nums = [2,7,11,15], target = 9 → Output: [0,1]

public class TwoSum {

    // Function to find two indices such that nums[i] + nums[j] = target
    public static int[] twoSum(int[] nums, int target) {
        // Iterate through the array using the first loop
        for (int i = 0; i < nums.length; i++) {
            // Inner loop checks all elements after the current one
            for (int j = i + 1; j < nums.length; j++) {
                // If the sum of nums[i] and nums[j] equals the target, return the indices
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j}; // Found the pair, return their indices
                }
            }
        }
        // If no pair is found, return an empty array (though problem guarantees one solution)
        return new int[] {}; // Not needed as per the problem constraints
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Call the function to get the indices
        int[] result = twoSum(nums, target);

        // Output the result (the indices of the two numbers that add up to the target)
        System.out.println("The indices are: [" + result[0] + ", " + result[1] + "]");  // Output: [0, 1]
    }
}

