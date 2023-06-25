package Max_Consecutive_Ones;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        var maxLen = 0;
        var curLen = 0;
        for (int num : nums) {
            if (num == 0) {
                maxLen = Math.max(maxLen, curLen);
                curLen = 0;
            } else {
                curLen++;
            }
        }
        maxLen = Math.max(maxLen, curLen);
        return maxLen;
    }
}