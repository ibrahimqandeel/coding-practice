package coding.challenges.codility;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
Write a function:

    class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..100,000];
        each element of array A is an inte
 */
public class SmallestMissingNumber {

    public static int solution(int[] A) {

        int expected = Integer.MAX_VALUE;
        Set<Integer> numberSet = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++) {
            numberSet.add(A[i]);
        }
        if (!numberSet.contains(1)) {
            return 1;
        }
        for (Integer element : numberSet) {
            if (element > 0) {
                if ((element - 1) != 0 && !numberSet.contains(element - 1)) {
                    if (expected > element - 1) {
                        expected = element - 1;
                    }
                } else if (!numberSet.contains(element + 1)) {
                    if (expected > element + 1) {
                        expected = element + 1;
                    }
                }
            }
        }
        return expected;
    }

    @Test
    public void test() {
        assertEquals(5, SmallestMissingNumber.solution(new int[]{1, 3, 6, 4, 1, 2}));
        assertEquals(4, SmallestMissingNumber.solution(new int[]{1, 2, 3}));
        assertEquals(1, SmallestMissingNumber.solution(new int[]{-1, 2, -3}));
        assertEquals(2, SmallestMissingNumber.solution(new int[]{-1, 1, -3}));
    }
}
