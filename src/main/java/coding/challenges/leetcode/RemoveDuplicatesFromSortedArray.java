package coding.challenges.leetcode;

/**
 * @link: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length < 1) return 0;
        int length = 0;
        int j = 0;
        while (++j < nums.length) {
            if (nums[length] != nums[j]) {
                nums[++length] = nums[j];
            }
        }

        return length + 1;
    }

    @Test
    public void test() {
        assertEquals(5, removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
        assertEquals(2, removeDuplicates(new int[]{1, 1, 2}));
        assertEquals(1, removeDuplicates(new int[]{1, 1, 1}));
        assertEquals(1, removeDuplicates(new int[]{1}));
        assertEquals(0, removeDuplicates(new int[]{}));
    }
}
