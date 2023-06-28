package t_3248_Remove_Duplicates_from_Sorted_Array;

class Solution {

    public int removeDuplicates(int[] nums) {
        var index = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (i == 0 || nums[i] != nums[i-1]) {
                nums[index++] = nums[i];
            }
        }
        return  index;
    }
}