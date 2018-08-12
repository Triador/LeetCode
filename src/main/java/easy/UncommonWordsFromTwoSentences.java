package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UncommonWordsFromTwoSentences {
    public String[] uncommonFromSentences(String A, String B) {
        String[] wordsB = B.split(" ");
        Map<String, Integer> words = new HashMap<>();

        for (String word: A.split(" ")) {
            words.put(word, words.getOrDefault(word, 0) + 1);
        }

        for (String word: B.split(" ")) {
            words.put(word, words.getOrDefault(word, 0) + 1);
        }

        ArrayList<String> result = new ArrayList<>();

        for (Map.Entry<String, Integer> entry: words.entrySet()) {
            if (entry.getValue() == 1) result.add(entry.getKey());
        }

        return result.toArray(new String[result.size()]);
    }
}
