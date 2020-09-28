package algo.kata.simple;

public class SomeTest {

    public boolean canJump(int[] A) {
        if (A == null) {
            return false;
        }
        int len = A.length;
        int right = 0;
        for (int i = 0; i < A.length; i++) {
            right = Math.max(right, i + A[i]);
            if (right == len - 1) {
                return true;
            }
            if (i == right) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(3/2);
        System.out.println(3%2);
    }
}
