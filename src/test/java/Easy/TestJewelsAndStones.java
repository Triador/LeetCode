package Easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestJewelsAndStones {

    @Test
    public void NumJewelsInStones() {
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        assertEquals(0, jewelsAndStones.numJewelsInStones("z", "ZZ"));
        assertEquals(3, jewelsAndStones.numJewelsInStones("aA", "aAAbbbb"));
    }
}
