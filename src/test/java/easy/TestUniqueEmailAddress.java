package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUniqueEmailAddress {

    @Test
    public void testNumUniqueEmails() {
        UniqueEmailAddress uniqueEmailAddress = new UniqueEmailAddress();
        assertEquals(2, uniqueEmailAddress.numUniqueEmails(
                new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"}));
    }
}
