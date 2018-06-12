package Easy;

public class HammingDistance {

    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((xor & (1 << i)) != 0) {
                count++;
            }
        }
        return count;
    }
}
