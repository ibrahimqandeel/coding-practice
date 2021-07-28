package coding.interviews.Abyat;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Abyat {

    public static String longestPalindrome(String text) {
        if (text.length() < 2) {
            return "";
        }

        int palindromeLength = 0;
        String temp = "";
        String resultWord = "";
        for (int i = 0; i < text.length(); i++) {
            for (int j = i + 2; j <= text.length(); j++) {
                temp = text.substring(i, j);
                if (isPalindrome(temp)) {
                    if (temp.length() > palindromeLength) {
                        palindromeLength = temp.length();
                        resultWord = temp;
                    }
                }
            }
        }
        return resultWord;
    }

    public static boolean isPalindrome(String word) {
        if (word == null && word.length() < 1) {
            return false;
        }

        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        return word.equals(reversedWord);
    }

    @Test
    public void longestPalindrome_test_1() {
        assertEquals("aba", longestPalindrome("aba"));
        assertEquals("dccccd", longestPalindrome("abacddccccdasdsds"));
        assertEquals("", longestPalindrome("ab"));
        assertEquals("abababababa", longestPalindrome("abcdeabababababa"));
        assertEquals("aba", longestPalindrome("abaaca"));
        assertEquals("abaaba", longestPalindrome("abaaba"));
    }
}
