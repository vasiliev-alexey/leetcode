package array_and_string.Find_Pivot_Index;

import java.util.Arrays;

class Solution {
    public int pivotIndex(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        var leftSum = 0;
        for (int i = 0; i < nums.length ; i++) {
           if (leftSum == sum - leftSum - nums[i]) {
               return i;
           }
           leftSum += nums[i];
        }
        return -1;
    }
}