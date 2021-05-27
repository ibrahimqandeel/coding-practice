package code.war.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import code.war.challenges.kata.EqualSidesOfArray;

class EqualSidesOfArrayTest {

	@Test
	void findEvenIndexTest() {
		assertEquals(3, EqualSidesOfArray.findEvenIndex(new int[] { 1, 2, 3, 4, 3, 2, 1 }));
		assertEquals(1, EqualSidesOfArray.findEvenIndex(new int[] { 1, 100, 50, -51, 1, 1 }));
		assertEquals(-1, EqualSidesOfArray.findEvenIndex(new int[] { 1, 2, 3, 4, 5, 6 }));
		assertEquals(3, EqualSidesOfArray.findEvenIndex(new int[] { 20, 10, 30, 10, 10, 15, 35 }));
		assertEquals(-1, EqualSidesOfArray.findEvenIndex(new int[] { -8505, -5130, 1926, -9026 }));
		assertEquals(1, EqualSidesOfArray.findEvenIndex(new int[] { 2824, 1774, -1490, -9084, -9696, 23094 }));
		assertEquals(6, EqualSidesOfArray.findEvenIndex(new int[] { 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4 }));
//		assertEquals(-1, EqualSidesOfArray
//				.findEvenIndex(new int[] { 1019, 8948, 8063, -2649, -8041, -2769, 1699, -2571, -6249 }));
		assertEquals(-1, EqualSidesOfArray.findEvenIndex(new int[] { 1, 10, -100 }));
	}
}
