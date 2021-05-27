package code.war.challenges.kata;

/*
 * @link https://www.codewars.com/kata/5679aa472b8f57fb8c000047
 */
public class EqualSidesOfArray {

	public static int findEvenIndex(int[] arr) {
		if (arr.length < 2) {
			return 0;
		}
		int rightSum = 0;
		int leftSum = 0;
		for (int i = 0; i < arr.length; i++) {
			rightSum += arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			rightSum -= arr[i];

			if (leftSum == rightSum) {
				return i;
			}
			leftSum += arr[i];
		}

		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
