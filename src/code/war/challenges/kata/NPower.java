package code.war.challenges.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * @link https://www.codewars.com/kata/57d814e4950d8489720008db
 */
public class NPower {

    public static int nthPower(int[] array, int n) {
        if (array != null && array.length > n) {
            return (int) Math.pow(array[n], n);
        }
        return -1;
    }

    @Test
    public void nthPowerTest() {
        assertEquals(-1, nthPower(new int[]{1, 2}, 2));
        assertEquals(8, nthPower(new int[]{3, 1, 2, 2}, 3));
        assertEquals(4, nthPower(new int[]{3, 1, 2}, 2));
    }
}
