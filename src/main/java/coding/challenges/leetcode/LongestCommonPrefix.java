package coding.challenges.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = "";
        boolean valid = true;
        int charIndex = 0;
        char tempChar = 0;
        while (valid) {
            for (int i = 0; i < strs.length; i++) {
                if (charIndex < strs[i].length()) {
                    if (i == 0) {
                        tempChar = strs[0].charAt(charIndex);
                    } else {
                        if (tempChar != strs[i].charAt(charIndex)) {
                            valid = false;
                            break;
                        }
                    }
                } else {
                    valid = false;
                }
            }
            if (valid) {
                prefix += tempChar;
                charIndex++;
            }
        }
        return prefix;
    }

    public String longestCommonPrefixLeetCode(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length() ; i++){
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j ++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }

    @Test
    public void test() {
        assertEquals("fl", longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        assertEquals("", longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        assertEquals("", longestCommonPrefix(new String[]{"dog", "", "door"}));
    }
}
