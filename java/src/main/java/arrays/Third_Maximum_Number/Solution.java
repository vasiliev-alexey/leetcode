package arrays.Third_Maximum_Number;

import java.util.Arrays;
import java.util.Optional;

class Solution {

    public int thirdMax(int[] nums) {
        nums = Arrays.stream(nums).distinct().sorted().toArray();
        if(nums.length < 3)   {
            return nums[nums.length - 1];
        }
        return Optional.of(nums[nums.length - 3]).orElse(nums[nums.length - 1]);
    }
}