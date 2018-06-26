package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyboardRow {
    public String[] findWords(String[] words) {
        Map<Character, Integer> symbolsRows = getSymbolsRows();
        List<String> result = new ArrayList<>();
        for (String word: words) {
            char[] charArray = word.toCharArray();
            int row = symbolsRows.get(charArray[0]);
            boolean add = true;
            for (char c: charArray) {
                if (symbolsRows.get(c) != row) {
                    add = false;
                    break;
                }
            }
            if (add) result.add(word);
        }
        String[] temp = new String[result.size()];
        return result.toArray(temp);
    }

    private Map<Character, Integer> getSymbolsRows() {
        Map<Character, Integer> symbolsRows = new HashMap<>();
        symbolsRows.put('A', 2); symbolsRows.put('a', 2);
        symbolsRows.put('B', 3); symbolsRows.put('b', 3);
        symbolsRows.put('C', 3); symbolsRows.put('c', 3);
        symbolsRows.put('D', 2); symbolsRows.put('d', 2);
        symbolsRows.put('E', 1); symbolsRows.put('e', 1);
        symbolsRows.put('F', 2); symbolsRows.put('f', 2);
        symbolsRows.put('G', 2); symbolsRows.put('g', 2);
        symbolsRows.put('H', 2); symbolsRows.put('h', 2);
        symbolsRows.put('I', 1); symbolsRows.put('i', 1);
        symbolsRows.put('J', 2); symbolsRows.put('j', 2);
        symbolsRows.put('K', 2); symbolsRows.put('k', 2);
        symbolsRows.put('L', 2); symbolsRows.put('l', 2);
        symbolsRows.put('M', 3); symbolsRows.put('m', 3);
        symbolsRows.put('N', 3); symbolsRows.put('n', 3);
        symbolsRows.put('O', 1); symbolsRows.put('o', 1);
        symbolsRows.put('P', 1); symbolsRows.put('p', 1);
        symbolsRows.put('Q', 1); symbolsRows.put('q', 1);
        symbolsRows.put('R', 1); symbolsRows.put('r', 1);
        symbolsRows.put('S', 2); symbolsRows.put('s', 2);
        symbolsRows.put('T', 1); symbolsRows.put('t', 1);
        symbolsRows.put('U', 1); symbolsRows.put('u', 1);
        symbolsRows.put('V', 3); symbolsRows.put('v', 3);
        symbolsRows.put('W', 1); symbolsRows.put('w', 1);
        symbolsRows.put('X', 3); symbolsRows.put('x', 3);
        symbolsRows.put('Y', 1); symbolsRows.put('y', 1);
        symbolsRows.put('Z', 3); symbolsRows.put('z', 3);
        return symbolsRows;
    }
}
