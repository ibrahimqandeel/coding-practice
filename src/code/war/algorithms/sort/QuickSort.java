package code.war.algorithms.sort;

/*
 * Quick Sort Algorithm
 * 
 * Best case ---> O(n log(n))
 * Average case ---> O(n log(n))
 * Worst case ---> O(n^2) ---> If the array is already sorted
 * Space complexity ---> O(1)
 */
public class QuickSort {

	public static void sort(int[] array, int start, int end) {
		if (start < end) {
			int i = start;
			int j = end;
			int temp;
			int pivot = array[i];
			while (i < j) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					i++;
				} else {
					if (array[i] == pivot) {
						j--;
					} else {
						i++;
					}
				}
			}
			sort(array, start, i - 1);
			sort(array, i + 1, end);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
