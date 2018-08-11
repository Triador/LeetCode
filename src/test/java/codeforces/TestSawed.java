package codeforces;

import codeforces.r493.Sawed;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSawed {

    @Test
    public void getSawedAmount() {
        Sawed sawed = new Sawed();
        assertEquals(1, sawed.getSawedAmount(6, 4, new int[]{1, 2, 5, 10, 15, 20}));
        assertEquals(0, sawed.getSawedAmount(4, 10, new int[]{1, 3, 2, 4}));
        assertEquals(2, sawed.getSawedAmount(6, 100, new int[]{1, 2, 3, 4, 5, 6}));
        assertEquals(2, sawed.getSawedAmount(100, 10, new int[]{3, 20, 3, 29, 90, 69, 2, 30, 70, 28, 71, 99, 22, 99, 34, 70, 87,
                48, 3, 92, 71, 61, 26, 90, 14, 38, 51, 81, 16, 33, 49, 71, 14, 52, 50, 95, 65, 16, 80, 57, 87, 47, 29, 14, 40, 31, 74, 15, 87,
                76, 71, 61, 30, 91, 44, 10, 87, 48, 84, 12, 77, 51, 25, 68, 49, 38, 79, 8, 7, 9, 39, 19, 48, 40, 15, 53, 29, 4, 60, 86, 76, 84,
                6, 37, 45, 71, 46, 38, 80, 68, 94, 71, 64, 72, 41, 51, 71, 60, 79, 7}));
    }
}
