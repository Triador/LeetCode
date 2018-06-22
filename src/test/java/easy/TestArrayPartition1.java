package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestArrayPartition1 {

    @Test
    public void arrayPairSum() {
        ArrayPartition1 arrayPartition1 = new ArrayPartition1();
        assertEquals(4, arrayPartition1.arrayPairSumI(new int[]{1,4,3,2}));
        assertEquals(1, arrayPartition1.arrayPairSumI(new int[]{1, 1}));
        assertEquals(3, arrayPartition1.arrayPairSumI(new int[]{1,1,2,2}));
        assertEquals(4, arrayPartition1.arrayPairSum(new int[]{1,4,3,2}));
        assertEquals(1, arrayPartition1.arrayPairSum(new int[]{1, 1}));
        assertEquals(3, arrayPartition1.arrayPairSum(new int[]{1,1,2,2}));
    }
}
