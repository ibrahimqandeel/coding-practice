package coding.challenges.hackerrank;

import java.util.ArrayList;
import java.util.List;

/*
 * @link https://www.hackerrank.com/challenges/plus-minus/problem
 */
public class PlusMinus {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        float positiveNums = 0, negativeNums = 0, zeroNums = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0) {
                zeroNums++;
            } else if (arr.get(i) > 0) {
                positiveNums++;
            } else {
                negativeNums++;
            }
        }

        System.out.printf("%.6f", positiveNums / arr.size());
        System.out.println();
        System.out.printf("%.6f", negativeNums / arr.size());
        System.out.println();
        System.out.printf("%.6f", zeroNums / arr.size());
    }

    public static void main(String[] args) {
        List arr = new ArrayList();
        arr.add(1);
        arr.add(1);
        arr.add(0);
        arr.add(-1);
        arr.add(-1);

        plusMinus(arr);
    }
}
