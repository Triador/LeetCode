package codeforces.r503;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestA {

    @Test
    public void test() {
        A a = new A();
        assertTrue(Arrays.equals(new int[]{1, 4, 2}, a.test(3, 6, 2, 3, 3, new int[][]{{1, 2, 1, 3}, {1, 4, 3 ,4}, {1, 2, 2, 3}})));
    }
}
