package algo.kata.simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindRepeatNumberTest {
    public int findRepeatNumber(int[] nums) {
        int i = 0;
        while (true) {
            if (i >= nums.length) {
                return -1;
            }
            int fromIndex = i;
            int toIndex = nums[i];
            int from = nums[fromIndex];
            int to = nums[toIndex];

            if (from == fromIndex) {
                i++;
                continue;
            }

            if (from == to) {
                return from;
            } else {
                swap(nums, fromIndex, toIndex);
            }
        }

    }

    public void swap(int[] nums, int fromIndex, int toIndex) {
        int from = nums[fromIndex];
        int to = nums[toIndex];
        from = from ^ to;
        to = from ^ to;
        from = from ^ to;
        nums[fromIndex] = from;
        nums[toIndex] = to;
    }


    @Test
    void should_find_repeat_number() {
        assertEquals(2, findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3}));
        assertEquals(1, findRepeatNumber(new int[]{1, 1}));
    }

    @Test
    void should_return_minus_one_if_not_found() {
        assertEquals(-1, findRepeatNumber(new int[]{0, 1}));
    }
}
