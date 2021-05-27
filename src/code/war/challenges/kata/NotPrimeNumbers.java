package code.war.challenges.kata;

import java.util.ArrayList;
import java.util.List;
import code.war.util.NumbersUtil;

/*
 * @link https://www.codewars.com/kata/5a9a70cf5084d74ff90000f7
 */
public class NotPrimeNumbers {

	public static List<Integer> notPrimes(int a, int b) {
		List<Integer> primeNumbersList = new ArrayList<>();
		int digit;
		int reminder;
		boolean allDigitsArePrime = false;
		if (a < b && b <= 20000) {
			for (int i = a; i < b; i++) {
				if (!NumbersUtil.isNumberPrime(i)) {
					digit = i;
					while (digit > 0) {
						reminder = NumbersUtil.getLeftDigit(digit);
						if (NumbersUtil.isNumberPrime(reminder)) {
							allDigitsArePrime = true;
							digit = digit / 10;
						} else {
							allDigitsArePrime = false;
							break;
						}
					}
					if (allDigitsArePrime) {
						primeNumbersList.add(i);
					}
				}
			}
		}
		return primeNumbersList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
