package array_and_string.Largest_Number_At_Least_Twice_of_Others;

import java.util.Arrays;

class Solution {
    public int dominantIndex(int[] nums) {
        var max = Arrays.stream(nums).max().getAsInt();
        var min = Arrays.stream(nums).filter(v -> v < max).max().getAsInt();

        if (min * 2 > max) return -1;

        for (int i = 0; i < nums.length ; i++) {
           if (nums[i] == max) {
               return  i;
           }
        }
        return -1;
    }
}