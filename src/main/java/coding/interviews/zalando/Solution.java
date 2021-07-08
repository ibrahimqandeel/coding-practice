package coding.interviews.zalando;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {

    public static void main(String[] args) {
//        System.out.println(find_min(solution(4)));
//        System.out.println(find_min(solution(6)));
//        System.out.println(find_min(solution(100)));
    }

    public int solution(int[] A, int[] B) {
        int turn = -1;
        int sumA = 0;
        int sumB = 0;
        int diff = 0;
        for (int i = 0; i < A.length; i++) {
            sumA += A[i];
        }

        for (int i = 0; i < B.length; i++) {
            sumB += B[i];
        }

        if (sumA > sumB) {
            diff = sumA - sumB;
            if (diff <= 6) {
                for (int i = 0; i < A.length; i++) {
                    if (diff < A[i]) {
                        diff = A[i] - diff;
                        turn++;
                    }
                    if (diff == 0) {
                        break;
                    }
                }
            }
        } else {
            diff = sumB - sumA;
        }

        return turn;
    }

//    public static int[] solution(int N) {
//        // write your code in Java SE 8
//        int[] A = new int[N];
//        Random random = new Random();
//        int randInt;
//        for (int i = 0; i < A.length; i++) {
//            randInt = random.nextInt(1000) + 1;
//            A[i] = randInt;
//        }
//        return A;
//    }

//    public static int find_min(int[] A) {
//        int ans = 0;
//        for (int i = 1; i < A.length; i++) {
//            if (ans > A[i]) {
//                ans = A[i];
//            }
//        }
//        return ans;
//    }
//    public static int solution(int[] A) {
//        // write your code in Java SE 8
//        Arrays.sort(A);
//        int result = 1;
//        for (int i = 0; i < A.length; i++) {
//            if (A[i] < 0) {
//                result = 1;
//            } else if (A[i] == result) {
//                result++;
//            }
//        }
//        return result;
//    }

//    @Test
//    public void test_solution() {
//        assertEquals(1, Solution.solution(new int[]{-1, -3}));
//        assertEquals(5, Solution.solution(new int[]{1, 3, 6, 4, 1, 2}));
//        assertEquals(4, Solution.solution(new int[]{1, 2, 3}));
//    }
}
