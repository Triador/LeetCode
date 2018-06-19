package Easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPeakIndexInMountainArray {

    @Test
    public void peakIndexInMountainArrayRecursive() {
        PeakIndexInMountainArray peakIndexInMountainArray = new PeakIndexInMountainArray();
        int[] array = new int[] {0, 1, 0};
        assertEquals(1, peakIndexInMountainArray.peakIndexInMountainArray(array, 0, array.length));
        array = new int[] {0, 2, 1, 0};
        assertEquals(1, peakIndexInMountainArray.peakIndexInMountainArray(array, 0, array.length));
        array = new int[] {40, 48, 61, 75, 100, 99, 98, 39, 30, 10};
        assertEquals(4, peakIndexInMountainArray.peakIndexInMountainArray(array, 0, array.length));
        array = new int[] {18, 29, 38, 59, 98, 100, 99, 98, 90};
        assertEquals(5, peakIndexInMountainArray.peakIndexInMountainArray(array, 0, array.length));
    }

    @Test
    public void peakIndexInMountainArray() {
        PeakIndexInMountainArray peakIndexInMountainArray = new PeakIndexInMountainArray();
        assertEquals(1, peakIndexInMountainArray.peakIndexInMountainArray(new int[] {0, 1, 0}));
        assertEquals(1, peakIndexInMountainArray.peakIndexInMountainArray(new int[] {0, 2, 1, 0}));
        assertEquals(4, peakIndexInMountainArray.peakIndexInMountainArray(new int[] {40, 48, 61, 75, 100, 99, 98, 39, 30, 10}));
        assertEquals(5, peakIndexInMountainArray.peakIndexInMountainArray(new int[] {18, 29, 38, 59, 98, 100, 99, 98, 90}));
    }
}
