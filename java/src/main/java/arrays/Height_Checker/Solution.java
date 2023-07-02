package arrays.Height_Checker;

import java.util.Arrays;

class Solution {

    public int heightChecker(int[] heights) {

        var target = Arrays.copyOfRange(heights, 0, heights.length);
        var indexCount = target.length;
        Arrays.sort(target);
        for (int i = 0; i < target.length; i++) {
            if (target[i] == heights[i]) {
                indexCount--;
            }
        }
        return indexCount;
    }
}