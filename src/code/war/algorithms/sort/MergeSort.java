package code.war.algorithms.sort;

/*
 * Merge Sort Algorithm
 * 
 * Best case ---> O(n log(n))
 * Average case ---> O(n log(n))
 * Worst case ---> O(n log(n))
 * Space complexity ---> O(n)
 */
public class MergeSort {

	public static void mergeSort(int[] dataArray) {
		int dataArrayLength = dataArray.length;
		if (dataArrayLength == 1) {
			return;
		}

		int middle = dataArrayLength / 2;
		int[] left = new int[middle];
		int[] right = new int[dataArrayLength - middle];

		for (int i = 0; i < left.length; i++) {
			left[i] = dataArray[i];
		}

		for (int i = 0; i < right.length; i++) {
			right[i] = dataArray[middle + i];
		}

		mergeSort(left);
		mergeSort(right);
		merge(dataArray, left, right);
	}

	public static void merge(int[] dataArray, int[] left, int[] right) {
		int d = 0, l = 0, r = 0;
		while (l < left.length && r < right.length) {
			// Ascending sort
			if (left[l] <= right[r]) {
				dataArray[d++] = left[l++];
			} else {
				dataArray[d++] = right[r++];
			}
		}

		while (l < left.length) {
			dataArray[d++] = left[l++];
		}

		while (r < right.length) {
			dataArray[d++] = right[r++];
		}
	}

	public static void main(String args[]) {
	}
}
