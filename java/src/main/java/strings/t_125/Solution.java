package strings.t_125;


import java.util.stream.Collectors;

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().chars().filter(c -> c >= 'a' && c <= 'z' || c >= '0' && c <= '9').mapToObj(Character::toString).collect(Collectors.joining());
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}