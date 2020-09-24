package algo.kata.simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static algo.kata.simple.TwoSum.twoSum;

public class TwoSumTest {
    @Test
    void should_return_two_sum() {
        int[] result = twoSum(new int[]{2, 7, 15, 18}, 9);
        Assertions.assertEquals(0, result[0]);
        Assertions.assertEquals(1, result[1]);
    }
}
