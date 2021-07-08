package coding.interviews.unifonic;

public class UnifonicClass {

    public int solution(int[] A) {
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i] == A[i - 1] && A[i] == A[i + 1]) {
                if (A[i] == 1) {
                    A[i] = 0;
                } else {
                    A[i] = 1;
                }
            } else if (A[i] == A[i - 1] && A[i] == A[i + 1]) {
                if (A[i] == 1) {
                    A[i] = 0;
                } else {
                    A[i] = 1;
                }
            }
        }
        return 0;
    }

}
/*
https://app.codility.com/c/run/P4VBCR-8AH/
 */
