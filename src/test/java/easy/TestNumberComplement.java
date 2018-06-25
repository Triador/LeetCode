package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNumberComplement {

    @Test
    public void findComplement() {
        NumberComplement numberComplement = new NumberComplement();
        assertEquals(2, numberComplement.findComplement(5));
        assertEquals(0, numberComplement.findComplement(1));
        assertEquals(0, numberComplement.findComplement(2147483647));
    }
}
