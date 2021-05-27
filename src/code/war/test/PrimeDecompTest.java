package code.war.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import code.war.challenges.kata.PrimeDecomp;

class PrimeDecompTest {

	@Test
	void factorsMethodTest() {
		assertEquals("", PrimeDecomp.factors(1));

		assertEquals("(3)", PrimeDecomp.factors(3));
		assertEquals("(3**2)", PrimeDecomp.factors(9));

		assertEquals("(2**2)(3**2)", PrimeDecomp.factors(36));

		assertEquals("(7919)", PrimeDecomp.factors(7919));

		assertEquals("(3)(19)(18493)", PrimeDecomp.factors(1054101));

		assertEquals("(2**4)(3)(11)(43)(15073)", PrimeDecomp.factors(342217392));

		assertEquals("(7537)(123863)", PrimeDecomp.factors(933555431));

		assertEquals("(2)(3**2)(7)(11)(31)(151)(331)", PrimeDecomp.factors(Integer.MAX_VALUE - 1));

		assertEquals("(2147483647)", PrimeDecomp.factors(Integer.MAX_VALUE));
	}
}
