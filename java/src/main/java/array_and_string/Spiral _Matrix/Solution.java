package array_and_string.Spiral_Matrix;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> resultList = new ArrayList<>();

        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;

        while (true) {
            for (int i = left; i <= right; i++) {
                resultList.add(matrix[top][i]);
            }
            top += 1;
            if (top > bottom) {
                break;
            }
            for (int i = top; i <= bottom; i++) {
                resultList.add(matrix[i][right]);
            }
            right -= 1;
            if (left > right) {
                break;
            }
            for (int i = right; i >= left; i--) {
                resultList.add(matrix[bottom][i]);
            }
            bottom -= 1;
            if (top > bottom) {
                break;
            }

            for (int i = bottom; i >= top; i--) {
                resultList.add(matrix[i][left]);
            }
            left += 1;
            if (left > right) {
                break;
            }
        }

        return resultList;


    }
}