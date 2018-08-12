package easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestTransposeMatrix {

    @Test
    public void testTranspose() {
        TransposeMatrix transposeMatrix = new TransposeMatrix();

        int[][] expect = new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        int[][] result = transposeMatrix.transpose(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        for (int i = 0; i < result.length; i++) {
            assertTrue(Arrays.equals(result[i], expect[i]));
        }

        expect = new int[][]{{1, 4}, {2, 5}, {3, 6}};
        result = transposeMatrix.transpose(new int[][]{{1, 2, 3}, {4, 5, 6}});
        for (int i = 0; i < result.length; i++) {
            assertTrue(Arrays.equals(result[i], expect[i]));
        }
    }
}
