package easy;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDividingNumbers = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) selfDividingNumbers.add(i);
        }
        return selfDividingNumbers;
    }

    private boolean isSelfDividing(int i) {
        int temp = i;
        while (temp != 0) {
            int mod = temp % 10;
            if (mod == 0 || i % mod != 0) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }
}
