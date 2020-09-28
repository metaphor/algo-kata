package algo.kata.simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

public class LongestDistanceTest {
    public static int getDis(int[] A, int n) {
        if (n == 1) {
            return 0;
        }
        int base = A[0];
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, A[i] - base);
        }

        return Math.max(max, getDis(Arrays.copyOfRange(A, 1, n), n - 1));
    }


    @ParameterizedTest
    @MethodSource
    void should_get_longest_distance(int[] A, int n, int expectedMax) {
        Assertions.assertEquals(expectedMax, getDis(A, n));
    }

    private static Stream<Arguments> should_get_longest_distance() {
        return Stream.of(
                Arguments.of(new int[]{15, 10}, 2, 0)
        );
    }
}
