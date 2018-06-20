package easy;

public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int right = A[i].length - 1;
            for (int j = 0; j < A[i].length /2; j++) {
                if (A[i][j] == A[i][right]) {
                    A[i][j] ^= 1;
                    A[i][right] ^= 1;
                }
                right--;
            }
            if (A[i].length % 2 != 0) {
                A[i][right] ^= 1;
            }
        }
        return A;
    }
}
