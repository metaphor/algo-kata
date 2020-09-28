package algo.kata.simple;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlipChessTest {

    public static int[][] flipChess(int[][] A, int[][] f) {
        for (int i = 0; i < f.length; i++) {
            int x = f[i][0];
            int y = f[i][1];
            flipChess(A, x, y - 1);
            flipChess(A, x, y + 1);
            flipChess(A, x - 1, y);
            flipChess(A, x + 1, y);
        }

        return A;
    }

    public static void flipChess(int[][] A, int x, int y) {
        if (x < 1 || y < 1 || x > 4 || y > 4) return;
        A[y - 1][x - 1] = (A[y - 1][x - 1] == 0 ? 1 : 0);
    }

    public static void main(String[] args) {
//        int[][] ints = flipChess(new int[][]{
//                new int[]{0, 0, 1, 1},
//                new int[]{1, 0, 1, 0},
//                new int[]{0, 1, 1, 0},
//                new int[]{0, 0, 1, 0},
//        }, new int[][]{
//                new int[]{2, 2},
//                new int[]{3, 3},
//                new int[]{4, 4},
//        });

        int[][] a = new int[][]{
                new int[]{0, 1, 0, 1},
                new int[]{1, 0, 0, 0},
                new int[]{1, 1, 0, 1},
                new int[]{1, 0, 0, 1},
        };

        int[][] b = new int[][]{
                new int[]{0, 1, 0, 0},
                new int[]{1, 0, 1, 0},
                new int[]{1, 0, 0, 0},
                new int[]{0, 0, 1, 1},
        };

        int[][] ints = flipChess(new int[][]{
                new int[]{0, 1, 0, 0},
                new int[]{1, 0, 1, 0},
                new int[]{1, 1, 0, 0},
                new int[]{1, 0, 0, 1},
        }, new int[][]{
                new int[]{2, 3},
                new int[]{4, 2},
                new int[]{2, 3},
        });

        System.out.println(Arrays.toString(ints));
    }

    @ParameterizedTest
    @MethodSource
    void should_get_longest_distance(int[] A, int n, int expectedMax) {
    }

    private static Stream<Arguments> should_get_longest_distance() {
        return Stream.of(
                Arguments.of(new int[]{15, 10}, 2, 0)
        );
    }
}
