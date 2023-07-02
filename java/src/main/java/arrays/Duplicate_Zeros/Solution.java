package arrays.Duplicate_Zeros;

class Solution {

    public void duplicateZeros(int[] arr) {
        int[] result = new int[arr.length];
        int resultIndex = 0;
        for (int num : arr) {
            result[resultIndex++] = num;
            if (resultIndex > result.length-1) {
                break;
            }
            if (num == 0   ) {
                result[resultIndex++] = 0;
            }
            if (resultIndex >= result.length) {
                break;
            }
        }
        System.arraycopy(result, 0, arr, 0, result.length);
    }
}