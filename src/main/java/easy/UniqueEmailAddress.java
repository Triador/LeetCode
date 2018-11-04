package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddress {
    public int numUniqueEmails(String[] emails) {
        Set<String> result = new HashSet<>();
        Arrays.stream(emails)
                .forEach(s -> result.add(processString(s)));
        return result.size();
    }

    public String processString(String str) {
        char[] chars = str.toCharArray();
        StringBuilder result = new StringBuilder();
        int atIndex = -1;
        boolean ignore = false;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '+') {
                ignore = true;
            }
            else if (chars[i] == '@') {
                atIndex = i;
            }
            else if (!ignore && chars[i] != '.') {
                result.append(chars[i]);
            }
        }
        result.append(str.substring(atIndex));
        return result.toString();
    }

    //Their solution
//    public int numUniqueEmails(String[] emails) {
//        Set<String> result = new HashSet<>();
//        Arrays.stream(emails)
//                .forEach(str -> {
//                    int atIndex = str.indexOf('@');
//                    String local = str.substring(0, atIndex);
//                    String rest = str.substring(atIndex);
//                    if (local.contains("+")) {
//                        local = local.substring(0, local.indexOf('+'));
//                    }
//                    local = local.replaceAll("\\.", "");
//                    result.add(local + rest);
//                });
//        return result.size();
//    }
}
