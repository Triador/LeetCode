package codeforces;

import codeforces.r494.PolycarpsPockets;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPolycarpsPockets {

    @Test
    public void polycarpsPockets() {
        PolycarpsPockets polycarpsPockets = new PolycarpsPockets();
        assertEquals(2, polycarpsPockets.polycarpsPockets(6, new int[]{1, 2, 4, 3, 3, 2}));
        assertEquals(1, polycarpsPockets.polycarpsPockets(1, new int[]{100}));
    }
}
