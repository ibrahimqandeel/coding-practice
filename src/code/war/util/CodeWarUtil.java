package code.war.util;

public class CodeWarUtil {

	public static void printArray(int[] array, int start, int end) {
		String comma = ",";
		while (start <= end) {
			if (start == end) {
				comma = "";
			}
			System.out.print(array[start++] + comma);
		}
		System.out.println();
	}

	public static void printArray(int[] array) {
		String comma = ",";
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				comma = "";
			}
			System.out.print(array[i] + comma);
		}
		System.out.println();
	}

}
