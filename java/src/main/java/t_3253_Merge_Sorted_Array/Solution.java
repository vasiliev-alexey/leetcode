package t_3253_Merge_Sorted_Array;

import java.util.Arrays;

class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, nums2.length);
        Arrays.sort(nums1);
    }
}