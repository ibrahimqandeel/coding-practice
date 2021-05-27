package code.war.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import code.war.challenges.kata.SortOddsInArray;

class SortOddsInArrayTest {

	@Test
	public void sortArrayTest() {
		assertArrayEquals(new int[] {}, SortOddsInArray.sortArray(new int[] {}));

		assertArrayEquals(new int[] { 1, 3, 2, 8, 5, 4 }, SortOddsInArray.sortArray(new int[] { 5, 3, 2, 8, 1, 4 }));

		assertArrayEquals(new int[] { 1, 3, 5, 8, 0 }, SortOddsInArray.sortArray(new int[] { 5, 3, 1, 8, 0 }));

	}
}
