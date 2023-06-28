package t_527_searching_for_items_in_an_array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Solution {

    public boolean checkIfExist(int[] arr) {
//        for (int i = 0; i < arr.length  ; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (i == j) continue;
//                if (arr[i] == arr[j] * 2) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
        var zeroCnt = 0;
        var nums = new HashSet<Integer>();
        for (int num : arr) {
            if (nums.contains(num * 2)) {
                return true;
            } else if (num % 2 == 0) {
                nums.add(num);
            }

            if(num == 0) {
                zeroCnt++;
            }

        }
        for (int j : arr) {
            if ( (j==0 && zeroCnt > 1) ||  (j!=0 && nums.contains(j * 2))) {
                return true;
            }
        }
        return false;
    }
}