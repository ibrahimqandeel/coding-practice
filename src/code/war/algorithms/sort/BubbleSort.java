package code.war.algorithms.sort;

/*
 * Bubble Sort Algorithm
 * 
 * Best case ---> O(n)
 * Average case ---> O(n^2)
 * Worst case ---> O(n^2)
 * Space complexity ---> O(1) ---> In place 
 */
public class BubbleSort {

	public static int[] sort(int[] array) {

		if (array.length < 2) {
			return array;
		}

		boolean isSwap = false;
		int temp;
		for (int i = 0; i < array.length; i++) {
			isSwap = false;
			for (int j = 1; j <= array.length - i - 1; j++) {
				if (array[j - 1] > array[j]) {
					isSwap = true;
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
			if (!isSwap) {
				break;
			}
		}

		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
