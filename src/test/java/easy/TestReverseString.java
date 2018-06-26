package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestReverseString {

    @Test
    public void reverseString() {
        ReverseString reverseString = new ReverseString();
        assertEquals("olleh", reverseString.reverseString("hello"));
    }
}
