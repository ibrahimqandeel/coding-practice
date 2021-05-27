package code.war.challenges.hackerrank;

import java.util.HashMap;
import java.util.Map;

/*
 * @link: https://www.hackerrank.com/challenges/sock-merchant?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class HackerRankSockMerchant {

	public static int sockMerchant(int n, int[] ar) {
		int count = 0;
		if (n < 2) {
			return count;
		}
		Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();
		Integer value = 0;
		for (int i = 0; i < n; i++) {
			value = pairs.get(ar[i]);
			if (value != null && value.intValue() == 1) {
				count++;
				pairs.put(ar[i], 0);
			} else {
				pairs.put(ar[i], 1);
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int[] ar = new int[] { 1, 2, 1, 2, 1, 3, 2 };
		int result = sockMerchant(ar.length, ar);
		System.out.println(result);
	}
}
