package code.war.algorithms.sort;

/*
 * Heap Sort Sort Algorithm
 * 
 * Best case ---> O(n log(n))
 * Average case ---> O(n log(n))
 * Worst case ---> O(n log(n))
 * Space complexity ---> O(1) ---> In place 
 */
public class HeapSort {

	public static int[] sort(int[] array) {
		if (array.length <= 1) {
			return array;
		}
		int midHeap = (array.length / 2) - 1;
		for (int parentIndex = midHeap; parentIndex >= 0; parentIndex--) {
			heapify(array, array.length, parentIndex);
		}

		for (int i = array.length - 1; i >= 0; i--) {
			swap(array, 0, i);
			heapify(array, i, 0);
		}

		return array;
	}

	public static void heapify(int[] array, int heapSize, int parentIndex) {
		int leftChildIndex = getLeftChildIndex(parentIndex);
		int rightChildIndex = getRightChildIndex(parentIndex);
		int largestIndex = parentIndex;

		if (leftChildIndex < heapSize && array[leftChildIndex] > array[largestIndex]) {
			largestIndex = leftChildIndex;
		}

		if (rightChildIndex < heapSize && array[rightChildIndex] > array[largestIndex]) {
			largestIndex = rightChildIndex;
		}

		if (parentIndex != largestIndex) {
			swap(array, parentIndex, largestIndex);
			heapify(array, heapSize, largestIndex);
		}
	}

	private static void swap(int[] array, int firstIndex, int secondIndex) {
		int swapTemp = array[firstIndex];
		array[firstIndex] = array[secondIndex];
		array[secondIndex] = swapTemp;
	}

	private static int getLeftChildIndex(int parent) {
		return 2 * parent + 1;
	}

	private static int getRightChildIndex(int parent) {
		return 2 * parent + 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
