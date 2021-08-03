package coding.challenges.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @link: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/
 */
public class RotateArray {
    //Time complexity: O(N)
    //Auxiliary Space: O(D)
    public static int[] rotate(int[] nums, int k) {
        int arraySize = nums.length;
        k = k % arraySize;
        int[] resultArray = new int[arraySize];
        int newPosition;

        for (int i = 0; i < arraySize; i++) {
            newPosition = getNewPosition(i, arraySize, k);
            resultArray[newPosition] = nums[i];
        }
        nums = resultArray;
        return nums;
    }

//    Time complexity: O(N * D)
//    Auxiliary Space: O(1)
    public static int[] rotate_better(int[] nums, int k) {
        int arraySize = nums.length;
        k = k % arraySize;
        for (int j = 0; j < k; j++) {
            int temp = nums[arraySize - 1];
            for (int i = arraySize - 2; i >= 0; i--) {
                nums[i + 1] = nums[i];
            }
            nums[0] = temp;
        }
        return nums;
    }

    private static int getNewPosition(int current, int size, int moves) {
        int newPosition = current + moves;
        return newPosition % size;
    }

    public static int[] rotate_best(int[] nums, int k) {
        int arraySize = nums.length;
        k = k % arraySize;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        return nums;
    }

    private static int[] reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temporary = nums[start];
            nums[start] = nums[end];
            nums[end] = temporary;
            start++;
            end--;
        }
        return nums;
    }

    @Test
    public void test_rotate() {
        assertArrayEquals(new int[]{3, 1, 2}, rotate(new int[]{1, 2, 3}, 1));
        assertArrayEquals(new int[]{3, 4, 1, 2}, rotate(new int[]{1, 2, 3, 4}, 2));
        assertArrayEquals(new int[]{2, 3, 4, 1}, rotate(new int[]{1, 2, 3, 4}, 3));
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3));
    }

    @Test
    public void test_rotate_better() {
        assertArrayEquals(new int[]{3, 1, 2}, rotate_better(new int[]{1, 2, 3}, 1));
        assertArrayEquals(new int[]{3, 4, 1, 2}, rotate_better(new int[]{1, 2, 3, 4}, 2));
        assertArrayEquals(new int[]{2, 3, 4, 1}, rotate_better(new int[]{1, 2, 3, 4}, 3));
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, rotate_better(new int[]{1, 2, 3, 4, 5, 6, 7}, 3));
    }

    @Test
    public void test_rotate_best() {
        assertArrayEquals(new int[]{3, 1, 2}, rotate_best(new int[]{1, 2, 3}, 1));
        assertArrayEquals(new int[]{3, 4, 1, 2}, rotate_best(new int[]{1, 2, 3, 4}, 2));
        assertArrayEquals(new int[]{2, 3, 4, 1}, rotate_best(new int[]{1, 2, 3, 4}, 3));
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, rotate_best(new int[]{1, 2, 3, 4, 5, 6, 7}, 3));
    }


    public static void main(String[] args) {
    }
}
