package Find_Numbers_with_Even_Number_of_Digits;

class Solution {
    public int findNumbers(int[] nums) {
        var result = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                result ++;
            }
        }
        return result;
    }
}