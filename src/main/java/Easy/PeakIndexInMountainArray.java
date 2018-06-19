package Easy;

public class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] A) {
        int left = 0, right = A.length - 1;
        int peak = 0;
        while (left < right) {
           peak = left + (right - left) / 2;
           if (A[peak] > A[peak - 1] && A[peak] > A[peak + 1]) {
               break;
           } else if (A[peak] > A[peak - 1]) {
               left = peak;
           } else {
               right = peak;
           }
        }
        return peak;
    }

    //recursiveVersion
    public int peakIndexInMountainArray(int[] A, int start, int end) {
        int peak = start + (end - start) / 2;
        if (A[peak] > A[peak - 1] && A[peak] > A[peak + 1]) {
            return peak;
        } else if (A[peak] < A[peak - 1] && A[peak] > A[peak + 1]) {
            return peakIndexInMountainArray(A, start, peak);
        } else {
            return peakIndexInMountainArray(A, peak, end);
        }
    }
}
