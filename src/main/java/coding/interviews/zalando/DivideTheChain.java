package coding.interviews.zalando;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivideTheChain {
    public static int solution(int A[]) {
        if (A.length < 5) {
            return 0;
        }

        int firstNum, secondNum;
        firstNum = secondNum = Integer.MAX_VALUE;
        int firstIndex = 0;
        int secondIndex = 4;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < firstNum) {
                if (firstIndex != secondIndex + 2 && firstIndex != secondIndex - 2 && i > 0 && i <= A.length - 1) {
                    firstNum = A[i];
                    firstIndex = i;
                }
            } else if (A[i] < secondNum) {
                if (secondIndex != firstIndex + 2 && secondIndex != firstIndex - 2 && i > 0 && i <= A.length - 1) {
                    secondNum = A[i];
                    secondIndex = i;
                }
            }
        }
        System.out.println(firstNum + "--->" + firstIndex);
        System.out.println(secondNum + "--->" + secondIndex);

        return A[firstIndex] + A[secondIndex];
    }

    @Test
    public void test() {
        assertEquals(4, solution(new int[]{1, 3, 6, 11, 1, 2})); //1,4
        assertEquals(13, solution(new int[]{1, 3, 6, 10, 12, 2})); //1,3
        assertEquals(4, solution(new int[]{10, 3, 8, 4, 1, 2}));//1,3
        assertEquals(5, solution(new int[]{11, 3, 2, 4, 2, 2}));//1,4
    }
}
