package array_and_string.Diagonal_Traverse;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        var result = new ArrayList<Integer>();

        var i = 0;
        var j = 0;
        var up = true;
        while (i < mat.length && j < mat[i].length) {
            result.add(mat[i][j]);
            if (up) {
                if (j == mat[i].length - 1) {
                    up = false;
                    i++;
                } else if (i == 0) {
                    j++;
                    up = false;
                } else {
                    i--;
                    j++;
                }
            } else if (i == mat.length - 1) {
                up = true;
                j++;
            } else if (j == 0) {
                up = true;
                i++;
            } else {
                i++;
                j--;
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}