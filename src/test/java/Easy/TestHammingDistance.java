package Easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHammingDistance {

    @Test
    public void hammingDistance() {
        HammingDistance hammingDistance = new HammingDistance();
        assertEquals(2, hammingDistance.hammingDistance(1, 4));
    }
}
