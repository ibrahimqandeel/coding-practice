package code.war.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import code.war.challenges.kata.CountingDuplicates;

class CountingDuplicatesTest {

	String testThousandA = new String(new char[1000]).replace('\0', 'a');
	String testHundredB = new String(new char[100]).replace('\0', 'b');
	String testTenC = new String(new char[10]).replace('\0', 'c');
	String test1CapitalA = new String(new char[1]).replace('\0', 'A');
	String test1d = new String(new char[1]).replace('\0', 'd');
	String test = test1d + test1CapitalA + testTenC + testHundredB + testThousandA;

	@Test
	public void duplicateCountTest() {
		assertEquals(0, CountingDuplicates.duplicateCount("abcde"));

		assertEquals(1, CountingDuplicates.duplicateCount("abcdea"));

		assertEquals(1, CountingDuplicates.duplicateCount("indivisibility"));

		assertEquals(4, CountingDuplicates.duplicateCount("abac1ff1b"));

		assertEquals(3, CountingDuplicates.duplicateCount(test));

	}

	public void cleverDuplicateCountTest() {
		assertEquals(0, CountingDuplicates.cleverDuplicateCount("abcde"));

		assertEquals(1, CountingDuplicates.cleverDuplicateCount("abcdea"));

		assertEquals(1, CountingDuplicates.cleverDuplicateCount("indivisibility"));

		assertEquals(4, CountingDuplicates.cleverDuplicateCount("abac1ff1b"));

		assertEquals(3, CountingDuplicates.cleverDuplicateCount(test));
	}
}
