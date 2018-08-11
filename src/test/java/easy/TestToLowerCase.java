package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestToLowerCase {

    @Test
    public void testToLowerCase() {
        ToLowerCase toLowerCase = new ToLowerCase();
        assertEquals("hello", toLowerCase.toLowerCase("HELLO"));
        assertEquals("keks", toLowerCase.toLowerCase("KeKs"));
    }
}
