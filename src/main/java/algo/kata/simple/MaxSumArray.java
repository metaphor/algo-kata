package algo.kata.simple;

import java.util.Arrays;

import static java.util.Arrays.copyOfRange;

public final class MaxSumArray {
    public static int maxSum(int[] nums) {
        if (nums.length == 1) return nums[0];
        int max = Arrays.stream(nums).sum();
        int leftMax = maxSum(copyOfRange(nums, 0, nums.length - 1));
        int rightMax = maxSum(copyOfRange(nums, 1, nums.length));
        return Math.max(Math.max(leftMax, rightMax), max);
    }
}
