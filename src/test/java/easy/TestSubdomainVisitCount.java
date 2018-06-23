package easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSubdomainVisitCount {

    @Test
    public void subdomainVisits() {
        SubdomainVisitCount subdomainVisitCount = new SubdomainVisitCount();
        List<String> expected = new ArrayList<>();
        expected.add("9001 discuss.leetcode.com");
        expected.add("9001 leetcode.com");
        expected.add("9001 com");
        List<String> result = subdomainVisitCount.subdomainVisits(new String[]{"9001 discuss.leetcode.com"});
        Collections.sort(expected);
        Collections.sort(result);
        assertEquals(expected, result);

        expected = new ArrayList<>();
        expected.add("901 mail.com");
        expected.add("50 yahoo.com");
        expected.add("900 google.mail.com");
        expected.add("5 wiki.org");
        expected.add("5 org");
        expected.add("1 intel.mail.com");
        expected.add("951 com");
        result = subdomainVisitCount.subdomainVisits(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"});
        Collections.sort(expected);
        Collections.sort(result);
        assertEquals(expected, result);
    }
}
