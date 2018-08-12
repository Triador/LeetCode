package easy;

/**
 * new knowledge:
 * 1) the better approach to analyze binary string is go through all 32 digits
 * 2) if n % 2 == 1 - the last one digit is one else zero
 */

public class BinaryGap {
    // My stupid solution
//    public int binaryGap(int N) {
//        if (N == 0) return 0;
//
//        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(N);
//        int significantDigits = 32 - numberOfLeadingZeros;
//        int numberOfTrailingZeros = Integer.numberOfTrailingZeros(N);
//        N >>>= numberOfTrailingZeros + 1;
//        int steps = significantDigits - numberOfTrailingZeros - 1;
//
//        if (steps == 0) return 0;
//
//        int maxDistance = 0, distance = 0;
//        for (int i = 0; i < steps; i++) {
//            if ((N & 1) == 0) {
//                distance++;
//                N >>>= 1;
//            } else {
//                if (maxDistance < distance) {
//                    maxDistance = distance;
//                }
//                distance = 0;
//                N >>>= 1;
//            }
//        }
//
//        return maxDistance + 1;
//    }

    //the best solution
    public int binaryGap(int N) {
        int last = -1, ans = 0;
        for (int i = 0; i < 32; ++i)
            if (((N >> i) & 1) > 0) {
                if (last >= 0)
                    ans = Math.max(ans, i - last);
                last = i;
            }

        return ans;
    }
}
