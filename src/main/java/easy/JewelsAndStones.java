package easy;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        int result = 0;
        Set<Character> jewels = new HashSet<>();
        for (char jewel: J.toCharArray()) jewels.add(jewel);
        for (char stone: S.toCharArray()) {
            if (jewels.contains(stone)) result++;
        }
        return result;
    }
}
