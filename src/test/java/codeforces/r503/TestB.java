package codeforces.r503;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestB {

    @Test
    public void test() {
        B b  = new B();
        assertTrue(Arrays.equals(new int[]{2, 2, 3}, b.test(3, new int[] {2, 3, 2})));
    }
}
