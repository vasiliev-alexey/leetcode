package arrays.Remove_Duplicates_from_Sorted_Array;

class Solution {
    public int removeDuplicates(int[] nums) {
        var uniqueNumCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                nums[uniqueNumCount++] = nums[i];
            }
        }
        return uniqueNumCount;
    }
}