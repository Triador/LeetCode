package easy;

public class ProjectionAreaOf3DShapes {
    public int projectionArea(int[][] grid) {
        int length = grid.length;
        int xyArea = 0, xzArea = 0, yzArea = 0;
        for (int i = 0; i < length; i++) {
            int xzMax = grid[i][0], yzMax = grid[i][i];
            for (int j = 0; j < length; j++) {
                if (grid[i][j] != 0) xyArea++;
                if (grid[i][j] > xzMax) xzMax = grid[i][j];
                if (grid[j][i] > yzMax) yzMax = grid[j][i];
            }
            xzArea += xzMax;
            yzArea += yzMax;
        }
        return xyArea + xzArea + yzArea;
    }
}
