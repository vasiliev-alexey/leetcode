package arrays.t_3251_Valid_Mountain_Array;

class Solution {

    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        var i = 1;
        while (i < arr.length && arr[i] > arr[i - 1]) {
            i++;

        }
        if (i == arr.length || i == 1) {
            return false;
        }
        while (i < arr.length && arr[i] < arr[i - 1]) {
            i++;
        }
        return i == arr.length;
    }
}