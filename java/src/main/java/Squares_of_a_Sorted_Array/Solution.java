package Squares_of_a_Sorted_Array;

import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {

     return    Arrays.stream(nums).map( v -> v * v).sorted().toArray();


    }
}