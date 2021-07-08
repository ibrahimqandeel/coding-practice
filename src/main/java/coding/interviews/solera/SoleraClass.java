package coding.interviews.solera;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;


public class SoleraClass {

    public static void main(String args[]) {

//        solution(0);
//        System.out.println(getDigitSum(10));
//        System.out.println(getDigitSum(1));
//        System.out.println(getDigitSum(13));
//        System.out.println(getDigitSum(1306));
//        System.out.println(getDigitSum(0));

    }

    public int solution(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        int number = 0;

        int firstPrevNum = 1;
        int secondPrevNum = 0;
        for (int i = 2; i <= N; i++) {
            number = getDigitSum(firstPrevNum) + getDigitSum(secondPrevNum);
            secondPrevNum = firstPrevNum;
            firstPrevNum = number;
        }
        return number;
    }


    public int getDigitSum(int num) {
        if (num % 10 == 0) {
            return num;
        }

        int result = 0;
        while (num > 0) {
            result += num % 10;
            num = num / 10;
        }

        return result;
    }

    @Test
    public void test_1() {
//        assertEquals(5, MissingInteger.findSmallestMissingInteger(new int[]{1, 3, 6, 4, 1, 2}));
//        assertEquals(4, MissingInteger.findSmallestMissingInteger(new int[]{1, 2, 3}));
//        assertEquals(1, MissingInteger.findSmallestMissingInteger(new int[]{-1, -3}));
    }
}
