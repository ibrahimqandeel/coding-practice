import static org.junit.jupiter.api.Assertions.assertEquals;

import coding.challenges.hackerrank.HackerRankSockMerchant;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HackerRankSockMerchantTest {

	@Test
	void sockMerchantTest() {
		Assertions.assertEquals(0, HackerRankSockMerchant.sockMerchant(2, new int[] { 1, 2 }));
		assertEquals(3, HackerRankSockMerchant.sockMerchant(7, new int[] { 1, 2, 1, 2, 1, 3, 3 }));
		assertEquals(2, HackerRankSockMerchant.sockMerchant(7, new int[] { 1, 2, 1, 2, 1, 3, 2 }));
		assertEquals(1, HackerRankSockMerchant.sockMerchant(3, new int[] { 1, 1, 3 }));
	}

}
