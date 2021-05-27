package code.war.algorithms.sort;

/*
 * Selection Sort Algorithm
 * 
 * Best case ---> O(n^2)
 * Average case ---> O(n^2)
 * Worst case ---> O(n^2)
 * Space complexity ---> O(1) ---> In place 
 */
public class SelectionSort {

	public static int[] sort(int[] array) {

		if (array.length < 2) {
			return array;
		}

		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}

		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
