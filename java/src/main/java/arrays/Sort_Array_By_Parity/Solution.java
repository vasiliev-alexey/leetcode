package arrays.Sort_Array_By_Parity;
class Solution {
    private void swap(int[] nums, int i, int j) {
        var tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    public int[] sortArrayByParity(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] % 2 == 0) {
                        swap(nums, i, j);
                        break;
                    }
                }
            }
        }
        return nums;
    }
}