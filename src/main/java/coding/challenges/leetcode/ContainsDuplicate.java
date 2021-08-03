package coding.challenges.leetcode;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @link: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length < 2) return false;
        HashSet<Integer> numSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!numSet.add(nums[i])) return true;
        }
        return false;
    }

    @Test
    public void test() {
        assertEquals(true, containsDuplicate(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
        assertEquals(true, containsDuplicate(new int[]{1, 1, 2}));
        assertEquals(true, containsDuplicate(new int[]{1, 1, 1}));
        assertEquals(false, containsDuplicate(new int[]{1}));
        assertEquals(false, containsDuplicate(new int[]{1, 2, 3}));
    }
}
