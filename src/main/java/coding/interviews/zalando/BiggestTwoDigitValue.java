package coding.interviews.zalando;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BiggestTwoDigitValue {

    public static int solution(String S) {
        // write your code in Java SE 8
        int maxNum = Integer.MIN_VALUE;
        int tempNum = 0;
        for (int i = 0; i < S.length() - 1; i++) {
            tempNum = Integer.valueOf(S.substring(i, i + 2));
            if (tempNum > maxNum) {
                maxNum = tempNum;
            }
        }
        return maxNum;
    }

    @Test
    public void test() {
        assertEquals(55, solution("50552"));
        assertEquals(10, solution("100"));
        assertEquals(10, solution("10"));
        assertEquals(99, solution("99099"));
        assertEquals(88, solution("88"));
        assertEquals(10, solution("10101"));
        assertEquals(88, solution("880"));
        assertEquals(12, solution("1012"));
    }
}
