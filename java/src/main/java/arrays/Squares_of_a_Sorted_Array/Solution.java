package arrays.Squares_of_a_Sorted_Array;


class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] output = new int[nums.length];

        int tailIndex = nums.length-1;
        int headIndex = 0;

        for (int i = 0; i < nums.length; i++){

            if (i + 1 < nums.length && nums[i] > nums[i + 1]) {
                throw new RuntimeException("It is not sorted array!");
            }

            if( Math.abs(nums[headIndex]) > Math.abs(nums[tailIndex])){
                output[nums.length-1-i] = nums[headIndex] * nums[headIndex];
                headIndex++;
            }else {
                output[nums.length-1-i] = nums[tailIndex] * nums[tailIndex];
                tailIndex--;
            }
        }

        return output;
    }
}