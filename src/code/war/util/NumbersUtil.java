package code.war.util;

public class NumbersUtil {

	public static boolean isNumberPrime(double primeNumber) {
		if (primeNumber <= 1) {
			return false;
		}
		if (primeNumber == 2) {
			return true;
		}
		for (int i = 2; i <= Math.sqrt(primeNumber); i++) {
			if (primeNumber % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static double getNextPrime(double primeNum) {
		if (primeNum <= 1) {
			return 2;
		}
		do {
			primeNum++;
		} while (!isNumberPrime(primeNum));
		return primeNum;
	}

	public static int getLeftDigit(int number) {
		return number % 10;
	}

	public static String reversNumber(int number) {
		String reversedNumber = "";
		boolean isNegativeNumber = false;
		if (number < 0) {
			isNegativeNumber = true;
		}
		if (number >= 0 && number <= 9) {
			return reversedNumber = number + "";
		}
		number = Math.abs(number);
		while (number > 0) {
			reversedNumber += number % 10;
			number = number / 10;
		}
		return isNegativeNumber ? "-" + reversedNumber : reversedNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
