package arrays.Find_All_Numbers_Disappeared_in_an_Array;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] numUnique =  new int[nums.length];
        var result =  new ArrayList<Integer>();
        for (int num : nums) {
            numUnique[num - 1]++;
        }

        for (int i = 0; i < numUnique.length; i++) {
            if (numUnique[i] == 0) {
                result.add(i + 1);
            }
        }
        return result;
    }
}