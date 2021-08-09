package coding.challenges.leetcode;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @link https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/546/
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, ArrayList<Integer>> diff = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (diff.containsKey(target - nums[i])) {
                diff.get(target - nums[i]).add(i);
            } else {
                ArrayList<Integer> val = new ArrayList<>();
                val.add(i);
                diff.put(target - nums[i], val);
            }
        }

        int[] resultArray = new int[2];
        for (int i = 0; i < nums.length; i++) {
            ArrayList<Integer> val = diff.get(nums[i]);
            if (val != null) {
                for (int j = 0; j < val.size(); j++) {
                    int index = val.get(j);
                    if (index != i) {
                        resultArray[0] = i;
                        resultArray[1] = index;
                        return resultArray;
                    }
                }
            }
        }

        return resultArray;
    }

    @Test
    public void test() {
        assertArrayEquals(new int[]{0, 1}, twoSum(new int[]{3, 2, 1}, 5));
        assertArrayEquals(new int[]{1, 2}, twoSum(new int[]{2, 5, 5, 11}, 10));
        assertArrayEquals(new int[]{1, 3}, twoSum(new int[]{2, 500, 5, 1}, 501));
    }
}
