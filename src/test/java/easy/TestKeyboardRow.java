package easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestKeyboardRow {

    @Test
    public void findWords() {
        KeyboardRow keyboardRow = new KeyboardRow();
        assertTrue(Arrays.equals(new String[]{"Alaska", "Dad"}, keyboardRow.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"})));
    }
}
