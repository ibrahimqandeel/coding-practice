package code.war.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import code.war.util.NumbersUtil;

class NumbersUtilTest {

	@Test
	void isNumberPrimeTest() {

		// Prime Numbers
		assertEquals(true, NumbersUtil.isNumberPrime(2));
		assertEquals(true, NumbersUtil.isNumberPrime(3));
		assertEquals(true, NumbersUtil.isNumberPrime(5));
		assertEquals(true, NumbersUtil.isNumberPrime(7));
		assertEquals(true, NumbersUtil.isNumberPrime(11));
		assertEquals(true, NumbersUtil.isNumberPrime(19));

		// Not Prime Numbers
		assertEquals(false, NumbersUtil.isNumberPrime(0));
		assertEquals(false, NumbersUtil.isNumberPrime(1));
		assertEquals(false, NumbersUtil.isNumberPrime(4));
		assertEquals(false, NumbersUtil.isNumberPrime(20));
		assertEquals(false, NumbersUtil.isNumberPrime(21));
		assertEquals(false, NumbersUtil.isNumberPrime(100));
	}

	@Test
	void getNextPrimeTest() {
		assertEquals(2, NumbersUtil.getNextPrime(0));
		assertEquals(2, NumbersUtil.getNextPrime(1));
		assertEquals(3, NumbersUtil.getNextPrime(2));
		assertEquals(7, NumbersUtil.getNextPrime(5));
		assertEquals(11, NumbersUtil.getNextPrime(7));
		assertEquals(19, NumbersUtil.getNextPrime(17));
	}

	@Test
	void reversNumberTest() {
		assertEquals("-001", NumbersUtil.reversNumber(-100));
		assertEquals("-2", NumbersUtil.reversNumber(-2));
		assertEquals("0", NumbersUtil.reversNumber(0));
		assertEquals("01", NumbersUtil.reversNumber(10));
		assertEquals("001", NumbersUtil.reversNumber(100));
		assertEquals("909", NumbersUtil.reversNumber(909));
		assertEquals("111", NumbersUtil.reversNumber(111));
	}

}
