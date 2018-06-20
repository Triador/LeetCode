package easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSelfDividingNumbers {

    @Test
    public void selfDividingNumbers() {
        SelfDividingNumbers selfDividingNumbers = new SelfDividingNumbers();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(11);
        list.add(12);
        list.add(15);
        list.add(22);
        assertEquals(list, selfDividingNumbers.selfDividingNumbers(1, 22));
    }
}
