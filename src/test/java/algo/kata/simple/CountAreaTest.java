package algo.kata.simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountAreaTest {
    public int countArea(int[] A, int n) {
        return countArea(A, n, 0, n - 1);
    }

    public int countArea(int[] A, int n, int start, int end) {
        if (start > end) return 0;
        if (start == end) return A[start];
        int min = start;
        for (int i = start; i < end + 1; i++) {
            if (A[min] > A[i]) min = i;
        }

        int area = A[min] * (end - start + 1);
        int leftArea = countArea(A, n - 1, start, min - 1);
        int rightArea = countArea(A, n - 1, min + 1, end);


        return Math.max(area, Math.max(leftArea, rightArea));
    }

    @Test
    void should_count_area() {
        int[] a = {2, 7, 9, 4, 1};
        int area = countArea(a, a.length);
        Assertions.assertEquals(14, area);
    }
}
