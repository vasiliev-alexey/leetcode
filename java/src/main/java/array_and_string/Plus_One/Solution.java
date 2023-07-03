package array_and_string.Plus_One;

import java.util.ArrayList;
 import java.util.Collections;

class Solution {
    public int[] plusOne(int[] digits) {

         var result = new ArrayList<Integer>(digits.length + 1);
         var rest  =1;
        for (int i = digits.length - 1; i >= 0; i--) {
            var tmp = digits[i] + rest;
            result.add(tmp % 10);
            rest = tmp / 10;
        }
        if (rest == 1) {
            result.add(1);
        }
        Collections.reverse(result);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}