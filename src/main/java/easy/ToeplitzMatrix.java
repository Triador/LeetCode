package easy;

public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int rowBorder = matrix.length;
        int colBorder = matrix[0].length;

        for (int i = 0; i < rowBorder; i++) {
            for (int j = 0; j < colBorder; j++) {
                if (i + 1 < rowBorder && j + 1 < colBorder
                        && !(matrix[i][j] == matrix[i + 1][j + 1])) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ToeplitzMatrix toeplitzMatrix = new ToeplitzMatrix();
        System.out.println(toeplitzMatrix.isToeplitzMatrix(new int[][]{
                {1, 2, 3, 4},
                {5, 1, 2, 3},
                {9, 5, 1, 2}
            }));
        System.out.println(toeplitzMatrix.isToeplitzMatrix(new int[][]{
                {1, 2},
                {2, 2}
        }));
    }
}
