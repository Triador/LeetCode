package easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestShortestDistanceToACharacter {

    @Test
    public void shortestToChar() {
        ShortestDistanceToACharacter shortestDistanceToACharacter = new ShortestDistanceToACharacter();
        assertTrue(Arrays.equals(new int[]{3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0}, shortestDistanceToACharacter.shortestToChar("loveleetcode", 'e')));
        int[] result = shortestDistanceToACharacter.shortestToChar("rzazolgxogbmcjjievdt", 'g');
        assertTrue(Arrays.equals(new int[]{6,5,4,3,2,1,0,1,1,0,1,2,3,4,5,6,7,8,9,10}, result));
    }
}
