package coding.challenges.leetcode;

import coding.algorithms.sort.BubbleSort;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @link https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/
 */
public class IntersectionOfTwoArrays2 {
    public int[] intersect_(int[] nums1, int[] nums2) {
        ArrayList<Integer> resultList = new ArrayList<>();
        int[] sourceArray = nums1.length <= nums2.length ? nums1 : nums2;
        int[] distArray = nums1.length > nums2.length ? nums1 : nums2;
        sourceArray = sort(sourceArray);
        int j = 0;
        for (int i = 0; i < sourceArray.length; i++) {
            if (i > 0 && sourceArray[i] == sourceArray[i - 1]) {
                j++;
            } else {
                j = 0;
            }
            for (int k = j; k < distArray.length; k++) {
                if (sourceArray[i] == distArray[k]) {
                    resultList.add(sourceArray[i]);
                    j = k;
                    break;
                }
            }
        }

        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> resultList = new ArrayList<>();
        int[] sourceArray = nums1.length <= nums2.length ? nums1 : nums2;
        int[] distArray = nums1.length > nums2.length ? nums1 : nums2;
        for (int i = 0; i < sourceArray.length; i++) {
            for (int j = 0; j < distArray.length; j++) {
                if (sourceArray[i] == distArray[j]) {
                    resultList.add(sourceArray[i]);
                    distArray[j] = 2000;
                    break;
                }
            }
        }

        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }


    private int[] sort(int[] array) {

        if (array.length < 2) {
            return array;
        }

        boolean isSwap = false;
        int temp;
        for (int i = 0; i < array.length; i++) {
            isSwap = false;
            for (int j = 1; j <= array.length - i - 1; j++) {
                if (array[j - 1] > array[j]) {
                    isSwap = true;
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
            if (!isSwap) {
                break;
            }
        }

        return array;
    }

    public static void main(String[] args) {
//        int[] a = new int[]{0, 4, 5, 7, 57, 79, 6, 7, 45, 34, 38, 85, 88, 92, 89, 44, 61, 77};
//        a = BubbleSort.sort(a);
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + ", ");
//        }
//        System.out.println();
//        int[] b = new int[]{5, 4, 57, 79, 7, 89, 88, 45, 34, 92, 38, 85, 6, 0, 77, 44, 61};
//        b = BubbleSort.sort(b);
//        for (int i = 0; i < b.length; i++) {
//            System.out.print(b[i] + ", ");
//        }

        int[] a = new int[]{61, 24, 20, 58, 95, 53, 17, 32, 45, 85, 70, 20, 83, 62, 35, 89, 5, 95, 12, 86, 58, 77, 30, 64, 46, 13, 5, 92, 67, 40, 20, 38, 31, 18, 89, 85, 7, 30, 67, 34, 62, 35, 47, 98, 3, 41, 53, 26, 66, 40, 54, 44, 57, 46, 70, 60, 4, 63, 82, 42, 65, 59, 17, 98, 29, 72, 1, 96, 82, 66, 98, 6, 92, 31, 43, 81, 88, 60, 10, 55, 66, 82, 0, 79, 11, 81};
        a = BubbleSort.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
        int[] b = new int[]{5, 25, 4, 39, 57, 49, 93, 79, 7, 8, 49, 89, 2, 7, 73, 88, 45, 15, 34, 92, 84, 38, 85, 34, 16, 6, 99, 0, 2, 36, 68, 52, 73, 50, 77, 44, 61, 48};
        b = BubbleSort.sort(b);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + ", ");
        }

        System.out.println();
        int[] c = new int[]{5, 4, 57, 79, 7, 89, 88, 45, 34, 92, 38, 85, 6, 0, 77, 44, 61};
        c = BubbleSort.sort(c);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + ", ");
        }

    }

    @Test
    public void test() {
        assertArrayEquals(new int[]{1}, intersect(new int[]{3, 1, 2}, new int[]{1, 1}));
        assertArrayEquals(new int[]{2, 2}, intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
        assertArrayEquals(new int[]{4, 9}, intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}));
        assertArrayEquals(new int[]{5}, intersect(new int[]{5, 5}, new int[]{9, 4, 1, 8, 5}));
        assertArrayEquals(new int[]{0, 4, 5, 6, 7, 34, 38, 44, 45, 57, 61, 77, 79, 85, 88, 89, 92}, intersect(new int[]{61, 24, 20, 58, 95, 53, 17, 32, 45, 85, 70, 20, 83, 62, 35, 89, 5, 95, 12, 86, 58, 77, 30, 64, 46, 13, 5, 92, 67, 40, 20, 38, 31, 18, 89, 85, 7, 30, 67, 34, 62, 35, 47, 98, 3, 41, 53, 26, 66, 40, 54, 44, 57, 46, 70, 60, 4, 63, 82, 42, 65, 59, 17, 98, 29, 72, 1, 96, 82, 66, 98, 6, 92, 31, 43, 81, 88, 60, 10, 55, 66, 82, 0, 79, 11, 81}, new int[]{5, 25, 4, 39, 57, 49, 93, 79, 7, 8, 49, 89, 2, 7, 73, 88, 45, 15, 34, 92, 84, 38, 85, 34, 16, 6, 99, 0, 2, 36, 68, 52, 73, 50, 77, 44, 61, 48}));
    }
}
