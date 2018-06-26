package easy;

public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word: words) {
            StringBuilder sb = new StringBuilder(word);
            result.append(sb.reverse()).append(" ");
        }
        result.deleteCharAt(result.lastIndexOf(" "));
        return result.toString();
    }
}
