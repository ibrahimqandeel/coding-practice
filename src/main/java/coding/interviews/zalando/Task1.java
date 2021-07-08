package coding.interviews.zalando;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1 {

    public int solution(String S) {
        // write your code in Java SE 8
        int result = 0;
        int temp = 0;
        for (int i = 0; i < S.length() - 1; i++) {
            temp = Integer.parseInt((S.charAt(i) + "") + (S.charAt(i + 1) + ""));
            if (temp > result) {
                result = temp;
            }
        }

        return result;
    }

    @Test
    public void test_1() {
        assertEquals(55, solution("50552"));
        assertEquals(10, solution("10101"));
        assertEquals(88, solution("880"));
        assertEquals(12, solution("1012"));
    }
}
