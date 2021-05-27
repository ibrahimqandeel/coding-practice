package code.war.challenges.leetcode;

/*
 * @link https://leetcode.com/problems/reverse-integer/
 */
public class ReverseInteger {
    public int reverse(int x) {
        String result = "";
        if (x == 0) {
            return x;
        }
        if (x < 0) {
            result += "-";
            x = x * -1;
        }
        String value = Integer.toString(x);
        for (int i = value.length() - 1; i >= 0; i--) {
            if (!(value.charAt(i) == '0' && i == value.length() - 1)) {
                result += value.charAt(i) + "";
            }
        }
        try {
            return Integer.parseInt(result);
        } catch (NumberFormatException ex) {
            return 0;
        }
    }

    public static void main(String[] args) {
        ReverseInteger newReverseInteger = new ReverseInteger();
        System.out.println(newReverseInteger.reverse(964632435));
    }
}
