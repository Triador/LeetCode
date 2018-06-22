package easy;

import java.util.Arrays;

public class ArrayPartition1 {

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }

    //bucket sort
    public int arrayPairSumI(int[] nums) {
        int res = 0;
        int[] count = new int[20001];
        for(int i : nums){
            count[i + 10000]++;
        }

        boolean odd = true;
        for(int i = 0; i < count.length; i++) {
            if(count[i] != 0){
                if(odd) {
                    res += i - 10000;
                }
                odd=!odd;
                count[i]-=1;
                i-=1;
            }
        }

        return res;
    }
}
