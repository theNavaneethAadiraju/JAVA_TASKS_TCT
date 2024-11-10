package com.javatasks.arrayss;

public class MissingNumber2 {
    public static void main(String[] args) {
        // Example input array. This array contains distinct numbers from the range [0, n].
        int[] arr = {3, 0, 1};  // In this case, the missing number is 2.

        // Step 1: Create a boolean array 'visited' of size n + 1.
        // The size is n + 1 because the numbers range from 0 to n (inclusive).
        int n = arr.length;
        boolean[] visited = new boolean[n + 1];  // This array will keep track of which numbers we have seen.
        
        // Step 2: Iterate through the input array to mark the numbers that appear.
        // For each number in the input array, we mark the corresponding index in 'visited' as 'true'.
        for (int num : arr) {
            visited[num] = true;  // Mark the number at index 'num' as visited.
        }

        // Step 3: Find the missing number by looking for the first index in 'visited' that is still 'false'.
        // The missing number will be the index of the first 'false' in the 'visited' array.
        for (int i = 0; i <= n; i++) {
            // If the value at index 'i' in 'visited' is still 'false', then 'i' is the missing number.
            if (!visited[i]) {
                System.out.println("The missing number is: " + i);  // Print the missing number
                return;  // We can return early since we found the missing number
            }
        }
    }
}
