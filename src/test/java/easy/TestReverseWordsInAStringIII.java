package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestReverseWordsInAStringIII {

    @Test
    public void reverseWords() {
        ReverseWordsInAStringIII reverseWordsInAStringIII = new ReverseWordsInAStringIII();
        assertEquals("s'teL ekat edoCteeL tsetnoc", reverseWordsInAStringIII.reverseWords("Let's take LeetCode contest"));
    }
}
