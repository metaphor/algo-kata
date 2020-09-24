package algo.kata.simple;

public final class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] minusNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            minusNums[i] = target - nums[i];
            for (int j = 0; j < i; j++) {
                if (minusNums[j] == nums[i]) {
                    return new int[]{j, i};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
