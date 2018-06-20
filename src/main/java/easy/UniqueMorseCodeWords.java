package easy;

import java.util.HashSet;

public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
                ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                "...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> wordsMorseCode = new HashSet<>();
        for (String word: words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                sb.append(morseCodes[word.charAt(i) - 'a']);
            }
            wordsMorseCode.add(sb.toString());
        }
        return wordsMorseCode.size();
    }
}
