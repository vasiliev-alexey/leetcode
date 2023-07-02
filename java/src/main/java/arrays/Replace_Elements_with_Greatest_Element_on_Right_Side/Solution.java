package arrays.Replace_Elements_with_Greatest_Element_on_Right_Side;

class Solution {
    public int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                arr[i] = -1;
                break;
            }
            arr[i] = arr[i + 1];
            for (int j = i + 2; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    arr[i] = arr[j];
                }
            }
        }
        return arr;
    }
}