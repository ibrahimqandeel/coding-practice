package coding.interviews.solera;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InterviewClass {

    public static void main(String args[]) {
        int x = Integer.MAX_VALUE;
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
//        int first, second;
//
//        for (int i = 0; i < A.length; i++) {
//            if (A[i] < second && i != first && ((i >= first + 2) || (i <= first - 2)) {
//                second = A[i];
//            }
//        }
        return 0;
    }

    @Test
    public void test_1() {
        assertEquals(5, 5);
        assertArrayEquals(new int[]{20, 37, 21}, new int[]{20, 37, 21});
    }
}
