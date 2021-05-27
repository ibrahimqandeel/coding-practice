package code.war.challenges.kata;

/*
 * /*
 * @link https://www.codewars.com/kata/54d512e62a5e54c96200019e
 * 
 */
import code.war.util.NumbersUtil;

public class PrimeDecomp {

	public static String factors(int n) {

		return findFactors(n, 2);
	}

	private static String findFactors(int n, int prime) {
		int counter = 0;
		if (NumbersUtil.isNumberPrime(n)) {
			return buildString(n, 1);
		}

		while (n % prime == 0) {
			counter++;
			n = n / prime;
		}

		if (n <= 1) {
			return buildString(prime, counter);
		}

		return buildString(prime, counter) + findFactors(n, (int) NumbersUtil.getNextPrime(prime));
	}

	private static String buildString(int prime, int counter) {
		return counter < 1 ? "" : counter == 1 ? "(" + prime + ")" : "(" + prime + "**" + counter + ")";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factors(Integer.MAX_VALUE - 1));
	}

}
