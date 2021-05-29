import coding.algorithms.sort.SelectionSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SelectionSortTest {

    @Test
    void sortMethodTest() {
        Assertions.assertArrayEquals(new int[]{1, 2, 3}, SelectionSort.sort(new int[]{3, 2, 1}));

        assertArrayEquals(new int[]{1, 2, 4, 6, 8, 10, 33, 55, 80, 81},
                SelectionSort.sort(new int[]{55, 10, 8, 6, 80, 2, 81, 1, 4, 33}));
    }
}
