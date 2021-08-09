package coding.challenges.leetcode;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * @link: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/
 */
public class PlusOne {
    public int[] plusOne_(int[] digits) {
        int lastNumber = digits[digits.length - 1];
        if (lastNumber <= 8) {
            digits[digits.length - 1] = ++lastNumber;
            return digits;
        }

        long multiplier = 1;
        long sum = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            sum += (digits[i] * multiplier);
            multiplier *= 10;
        }
        sum++;

        ArrayList<Long> resultList = new ArrayList<>();
        if (multiplier > sum) {
            multiplier /= 10;
        }
        while (multiplier > 0) {
            long value = sum / multiplier;
            resultList.add(value);
            sum -= (value * multiplier);
            multiplier /= 10;
        }

        int[] resultArray = new int[resultList.size()];
        int i = 0;
        for (Long num : resultList) {
            resultArray[i] = num.intValue();
            i++;
        }

        return resultArray;
    }

    public int[] plusOne_2(int[] digits) {
        int lastNumber = digits[digits.length - 1];
        if (lastNumber <= 8) {
            digits[digits.length - 1] = ++lastNumber;
            return digits;
        }

        BigInteger multiplier = BigInteger.ONE;
        BigInteger divisor = BigInteger.ONE;
        for (int i = 0; i < digits.length - 1; i++) {
            multiplier = multiplier = multiplier.multiply(BigInteger.TEN);
        }
        divisor = multiplier;
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < digits.length; i++) {
            sum = sum.add(multiplier.multiply(BigInteger.valueOf(digits[i])));
//            sum += (digits[i] * multiplier);
            multiplier = multiplier.divide(BigInteger.TEN);
        }
        sum = sum.add(BigInteger.ONE);
        System.out.println(sum);

        ArrayList<Long> resultList = new ArrayList<>();
        if (sum.divide(divisor).compareTo(BigInteger.TEN) >= 0) {
            divisor = divisor.multiply(BigInteger.TEN);
        }
        while (divisor.compareTo(BigInteger.ZERO) > 0) {
            BigInteger value = sum.divide(divisor);
            resultList.add(value.longValue());
            sum = sum.subtract(value.multiply(divisor));
            divisor = divisor.divide(BigInteger.TEN);
        }

        int[] resultArray = new int[resultList.size()];
        int i = 0;
        for (Long num : resultList) {
            resultArray[i] = num.intValue();
            i++;
        }

        return resultArray;
    }

    public int[] plusOne(int[] digits) {
        int lastNumber = digits[digits.length - 1];
        if (lastNumber < 9) {
            digits[digits.length - 1] = ++lastNumber;
            return digits;
        }

        int reminder = 1;
        digits[digits.length - 1] = 0;
        for (int i = digits.length - 2; i >= 0; i--) {
            reminder = 1;
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] = digits[i] + 1;
                reminder = 0;
                break;
            }
        }
        int[] resultArray;
        if (reminder != 0) {
            resultArray = new int[digits.length + 1];
            resultArray[0] = reminder;
            for (int i = 0; i < digits.length; i++) {
                resultArray[i + 1] = digits[0];
            }

            return resultArray;
        }
        return digits;
    }


    @Test
    public void test() {
        assertArrayEquals(new int[]{1, 2, 4}, plusOne(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 2, 3, 5}, plusOne(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{9, 0, 1}, plusOne(new int[]{9, 0, 0}));
        assertArrayEquals(new int[]{1}, plusOne(new int[]{0}));
        assertArrayEquals(new int[]{2, 0, 5, 0}, plusOne(new int[]{2, 0, 4, 9}));
        assertArrayEquals(new int[]{1, 0, 0}, plusOne(new int[]{9, 9}));
        assertArrayEquals(new int[]{1, 0, 0, 0}, plusOne(new int[]{9, 9, 9}));
        assertArrayEquals(new int[]{9, 0, 0, 0}, plusOne(new int[]{8, 9, 9, 9}));
        assertArrayEquals(new int[]{5, 6, 2, 0, 0, 4, 6, 2, 5, 0}, plusOne(new int[]{5, 6, 2, 0, 0, 4, 6, 2, 4, 9}));
        assertArrayEquals(new int[]{5, 2, 2, 6, 5, 7, 1, 9, 0, 3, 8, 6, 8, 6, 5, 2, 1, 8, 7, 9, 8, 3, 8, 4, 7, 2, 5, 9, 0}, plusOne(new int[]{5, 2, 2, 6, 5, 7, 1, 9, 0, 3, 8, 6, 8, 6, 5, 2, 1, 8, 7, 9, 8, 3, 8, 4, 7, 2, 5, 8, 9}));
    }
}
