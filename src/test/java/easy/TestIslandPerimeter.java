package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestIslandPerimeter {

    @Test
    public void islandPerimeter() {
        int[][] grid = new int[][]{{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        IslandPerimeter islandPerimeter = new IslandPerimeter();
        assertEquals(16, islandPerimeter.islandPerimeter(grid));
    }
}
