package coding.interviews.callsign;
/**
 * @link https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/879/
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ReverseString {

    public String reverse(String input) {
        StringBuilder result = new StringBuilder();
        String temp = "";

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                temp += input.charAt(i);
            } else {
                result.append(reverseWord(new StringBuilder(temp))).append(" ");
                temp = "";
            }
        }

        if (temp != "") {
            result.append(reverseWord(new StringBuilder(temp)));
        }

        if (result.length() == 0) {
            return reverseWord(new StringBuilder(input));
        }
        return result.toString();
//        return reverseWord(stringObj);
    }

    private String reverseWord(StringBuilder word) {
        int start = 0;
        int end = word.length() - 1;
        char temp;
        while (start < end) {
            temp = word.charAt(start);
            word.setCharAt(start, word.charAt(end));
            word.setCharAt(end, temp);
            start++;
            end--;
        }
        return word.toString();
    }

    public char[] reverseString(char[] s) {
        if (s != null && s.length > 1) {
            int start = 0;
            int end = s.length - 1;
            char temp;

            while (start < end) {
                temp = s[start];
                s[start] = s[end];
                s[end] = temp;
                start++;
                end--;
            }
        }

        return s;
    }


    @Test
    public void test() {
        assertEquals("", reverse(""));
        assertEquals("olleh", reverse("hello"));
        assertEquals("olleh cba", reverse("hello abc"));
        assertEquals("dcba", reverse("abcd"));
    }

    @Test
    public void test2() {
        assertArrayEquals(new char[]{'o', 'l', 'l','e','H'}, reverseString(new char[]{'H', 'e', 'l','l','o'}));
    }
}
