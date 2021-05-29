import coding.algorithms.sort.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSortTest {

    @Test
    void sortMethodTest() {
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, BubbleSort.sort(new int[]{5, 4, 3, 2, 1}));

        assertArrayEquals(new int[]{1, 2, 4, 6, 8, 10, 33, 55, 80, 81},
                BubbleSort.sort(new int[]{55, 10, 8, 6, 80, 2, 81, 1, 4, 33}));

        assertArrayEquals(new int[]{1, 2, 3}, BubbleSort.sort(new int[]{1, 2, 3}));
    }
}
