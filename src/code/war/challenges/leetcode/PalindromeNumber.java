package code.war.challenges.leetcode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x < 10) {
            return true;
        }
        String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();
        String original = new StringBuilder().append(x).toString();
        return original.equals(reversed);
    }
}
