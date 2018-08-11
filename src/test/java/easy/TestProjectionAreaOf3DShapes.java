package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProjectionAreaOf3DShapes {

    @Test
    public void testProjectionArea() {
        ProjectionAreaOf3DShapes projectionAreaOf3DShapes = new ProjectionAreaOf3DShapes();
        assertEquals(5, projectionAreaOf3DShapes.projectionArea(new int[][]{{2}}));
        assertEquals(17, projectionAreaOf3DShapes.projectionArea(new int[][]{{1, 2}, {3, 4}}));
        assertEquals(8, projectionAreaOf3DShapes.projectionArea(new int[][]{{1, 0}, {0, 2}}));
        assertEquals(14, projectionAreaOf3DShapes.projectionArea(new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}}));
        assertEquals(21, projectionAreaOf3DShapes.projectionArea(new int[][]{{2, 2, 2}, {2, 1, 2}, {2, 2, 2}}));
    }
}
