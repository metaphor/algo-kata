package algo.kata.simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static algo.kata.simple.TwoSum.twoSum;

public class MaxSumArrayTest {
    @Test
    void should_return_two_sum() {
        int max = MaxSumArray.maxSum(new int[]{2, -1, 1, -2, 3, 3});
        Assertions.assertEquals(6, max);
    }
}
