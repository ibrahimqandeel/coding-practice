package code.war.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import code.war.challenges.hackerrank.HackerRankSockMerchant;

class HackerRankSockMerchantTest {

	@Test
	void sockMerchantTest() {
		assertEquals(0, HackerRankSockMerchant.sockMerchant(2, new int[] { 1, 2 }));
		assertEquals(3, HackerRankSockMerchant.sockMerchant(7, new int[] { 1, 2, 1, 2, 1, 3, 3 }));
		assertEquals(2, HackerRankSockMerchant.sockMerchant(7, new int[] { 1, 2, 1, 2, 1, 3, 2 }));
		assertEquals(1, HackerRankSockMerchant.sockMerchant(3, new int[] { 1, 1, 3 }));
	}

}
