package easy;

public class IslandPerimeter {
    int perimeter;
    int height, width;
    int[][] array;
    public int islandPerimeter(int[][] grid) {
        int x = 0, y = 0;
        height = grid.length;
        width = grid[y].length;
        array = grid;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    dfs(j, i);
                    break;
                }
            }
        }
        return perimeter;
    }
    private void dfs(int x, int y) {
        if (array[y][x] == 1) {
            array[y][x] = -1;
            if (y - 1 < 0 || array[y-1][x] == 0) perimeter++;
            else dfs(x, y - 1);
            if (y + 1 >= height || array[y+1][x] == 0) perimeter++;
            else dfs(x, y + 1);
            if (x - 1 < 0 || array[y][x-1] == 0) perimeter++;
            else dfs(x - 1, y);
            if (x + 1 >= width || array[y][x+1] == 0) perimeter++;
            else dfs(x + 1, y);
        }
    }
}
