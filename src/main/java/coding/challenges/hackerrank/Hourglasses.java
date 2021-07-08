package coding.challenges.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @link https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */
public class Hourglasses {
    public static int hourglassSum(List<List<Integer>> arr) {
        int maxSum = Integer.MIN_VALUE;
        int sum;
        for (int i = 1; i < arr.size() - 1; i++) {
            for (int j = 1; j < arr.get(i).size() - 1; j++) {
                sum = arr.get(i - 1).get(j - 1) + arr.get(i - 1).get(j) + arr.get(i - 1).get(j + 1);

                sum += arr.get(i).get(j);

                sum += arr.get(i + 1).get(j - 1) + arr.get(i + 1).get(j) + arr.get(i + 1).get(j + 1);

                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        return maxSum;
    }

    @Test
    public void hourglassSum_test_1() {
        List verticalList = new ArrayList<Integer>();
        verticalList.add(Arrays.asList(new Integer[]{1, 1, 1, 0, 0, 0}));
        verticalList.add(Arrays.asList(new Integer[]{0, 1, 0, 0, 0, 0}));
        verticalList.add(Arrays.asList(new Integer[]{1, 1, 1, 0, 0, 0}));
        verticalList.add(Arrays.asList(new Integer[]{0, 0, 2, 4, 4, 0}));
        verticalList.add(Arrays.asList(new Integer[]{0, 0, 0, 2, 0, 0}));
        verticalList.add(Arrays.asList(new Integer[]{0, 0, 1, 2, 4, 0}));
        assertEquals(19, Hourglasses.hourglassSum(verticalList));

        verticalList = new ArrayList<Integer>();
        verticalList.add(Arrays.asList(new Integer[]{1, 1, 1, 0, 0, 0}));
        verticalList.add(Arrays.asList(new Integer[]{0, 1, 0, 0, 0, 0}));
        verticalList.add(Arrays.asList(new Integer[]{1, 1, 1, 0, 0, 0}));
        verticalList.add(Arrays.asList(new Integer[]{0, 9, 2, -4, -4, 0}));
        verticalList.add(Arrays.asList(new Integer[]{0, 0, 0, -2, 0, 0}));
        verticalList.add(Arrays.asList(new Integer[]{0, 0, -1, -2, -4, 0}));
        assertEquals(13, Hourglasses.hourglassSum(verticalList));

        verticalList = new ArrayList<Integer>();
        verticalList.add(Arrays.asList(new Integer[]{-9, -9, -9, 1, 1, 1}));
        verticalList.add(Arrays.asList(new Integer[]{0, -9, 0, 4, 3, 2}));
        verticalList.add(Arrays.asList(new Integer[]{-9, -9, -9, 1, 2, 3}));
        verticalList.add(Arrays.asList(new Integer[]{0, 0, 8, 6, 6, 0}));
        verticalList.add(Arrays.asList(new Integer[]{0, 0, 0, -2, 0, 0}));
        verticalList.add(Arrays.asList(new Integer[]{0, 0, 1, 2, 4, 0}));
        assertEquals(28, Hourglasses.hourglassSum(verticalList));
    }
}

/*
   -9 -9 -9  1 1 1
 0 -9  0  4 3 2
-9 -9 -9  1 2 3
 0  0  8  6 6 0
 0  0  0 -2 0 0
 0  0  1  2 4 0
 */