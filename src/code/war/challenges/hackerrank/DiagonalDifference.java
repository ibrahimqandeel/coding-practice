package code.war.challenges.hackerrank;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * @link https://www.hackerrank.com/challenges/diagonal-difference/problem
 */
public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int right = 0, left = 0, sum;
        if (arr.size() == 0) {
            return 0;
        }

        int size = arr.size();
        int rightDiagonalIndex;
        for (int i = 0; i < arr.size(); i++) {
            left += arr.get(i).get(i);

            rightDiagonalIndex = (size - i) - 1;
            right += arr.get(i).get(rightDiagonalIndex);
        }

        sum = Math.abs(left - right);

        return sum;

    }

    @Test
    public void diagonalDifferenceTest() {
        List<List<Integer>> parentList = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(11);
        row1.add(2);
        row1.add(4);

        List<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);

        List<Integer> row3 = new ArrayList<>();
        row3.add(10);
        row3.add(8);
        row3.add(-12);
        parentList.add(row1);
        parentList.add(row2);
        parentList.add(row3);
        assertEquals(15, diagonalDifference(parentList));
    }
}
