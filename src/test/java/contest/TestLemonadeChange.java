package contest;

import contest.r91.LemonadeChange;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestLemonadeChange {

    @Test
    public void testLemonadeChange() {
        LemonadeChange lemonadeChange = new LemonadeChange();
        assertTrue(lemonadeChange.lemonadeChange(new int[]{5,5,5,10,20}));
        assertTrue(lemonadeChange.lemonadeChange(new int[]{5,5,10}));
        assertFalse(lemonadeChange.lemonadeChange(new int[]{10,10}));
        assertFalse(lemonadeChange.lemonadeChange(new int[]{5,5,10,10,20}));
    }
}
