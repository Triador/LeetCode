package utils;

import java.util.Map;

public class Compare {
    public static boolean compareTwoMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        return map1.entrySet().stream()
                .anyMatch(value1 -> map2.entrySet().stream()
                        .anyMatch(value2 -> value2.getKey().equals(value1.getKey())
                                && value2.getValue().equals(value1.getValue())));
    }
}
