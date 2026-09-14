package week5;
import java.util.Scanner;

public class Week5_TASK4_MaximumSumCircularSubarray {

    public static int maxSubarraySumCircular(int[] nums) {

        int totalSum = 0;

        // Maximum subarray
        int currentMax = nums[0];
        int maxSum = nums[0];

        // Minimum subarray
        int currentMin = nums[0];
        int minSum = nums[0];

        totalSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // Kadane's algorithm for maximum subarray
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSum = Math.max(maxSum, currentMax);

            // Kadane's algorithm for minimum subarray
            currentMin = Math.min(nums[i], currentMin + nums[i]);
            minSum = Math.min(minSum, currentMin);

            totalSum += nums[i];
        }

        // All elements are negative
        if (maxSum < 0) {
            return maxSum;
        }

        // Maximum circular subarray sum
        int circularSum = totalSum - minSum;

        return Math.max(maxSum, circularSum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Get array elements
        System.out.println("Enter the array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Find and display answer
        int result = maxSubarraySumCircular(nums);

        System.out.println("Maximum circular subarray sum: " + result);

        sc.close();
    }
}
