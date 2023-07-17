package array_and_string.Longest_Common_Prefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < strs[0].length() ; i++) {
            var matchCount = strs.length;
            for (String str : strs) {

                if(str.length() <= i) {
                    return result.toString();
                }

                if(str.charAt(i) != strs[0].charAt(i)  ) {
                    return result.toString();
                }
                matchCount--;

            }
            if (matchCount == 0) {
                result.append(strs[0].charAt(i));
            }
        }

        return result.toString();

    }
}