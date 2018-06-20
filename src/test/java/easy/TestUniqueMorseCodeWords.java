package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUniqueMorseCodeWords {

    @Test
    public void uniqueMorseRepresentations() {
        UniqueMorseCodeWords uniqueMorseCodeWords = new UniqueMorseCodeWords();
        assertEquals(2, uniqueMorseCodeWords.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
    }
}
