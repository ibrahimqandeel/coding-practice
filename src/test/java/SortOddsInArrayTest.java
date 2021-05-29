import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import coding.challenges.codewar.SortOddsInArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SortOddsInArrayTest {

	@Test
	public void sortArrayTest() {
		Assertions.assertArrayEquals(new int[] {}, SortOddsInArray.sortArray(new int[] {}));

		assertArrayEquals(new int[] { 1, 3, 2, 8, 5, 4 }, SortOddsInArray.sortArray(new int[] { 5, 3, 2, 8, 1, 4 }));

		assertArrayEquals(new int[] { 1, 3, 5, 8, 0 }, SortOddsInArray.sortArray(new int[] { 5, 3, 1, 8, 0 }));

	}
}
