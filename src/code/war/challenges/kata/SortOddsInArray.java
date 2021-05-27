package code.war.challenges.kata;

/*
 * @link https://www.codewars.com/kata/578aa45ee9fd15ff4600090d
 */
public class SortOddsInArray {

	public static int[] sortArray(int[] array) {
		if (array.length <= 1) {
			return array;
		}

		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] <= array[j]
						&& (array[i] % 2 != 0 && array[j] % 2 != 0 && array[i] != 0 && array[j] != 0)) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}

		return array;
	}

	public static void main(String[] args) {
	}
}
