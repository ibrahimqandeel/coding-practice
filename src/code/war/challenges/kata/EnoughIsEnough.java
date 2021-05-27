package code.war.challenges.kata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * @link https://www.codewars.com/kata/554ca54ffa7d91b236000023/train/java
 */
public class EnoughIsEnough {

	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		// Code here
		if (maxOccurrences < 1) {
			return new int[0];
		}
		StringBuffer elementsAsString = new StringBuffer();
		HashMap<Integer, Integer> elementsCount = new HashMap<>();
		Integer counter;
		int newArraySize = 0;
		for (int i = 0; i < elements.length; i++) {
			counter = elementsCount.get(elements[i]);
			if (counter == null) {
				elementsAsString.append(elements[i] + ",");
				elementsCount.put(elements[i], 1);
				newArraySize++;
			} else {
				if (counter < maxOccurrences) {
					elementsAsString.append(elements[i] + ",");
					elementsCount.replace(elements[i], ++counter);
					newArraySize++;
				}
			}

		}
		int[] resultArray = new int[newArraySize];
		String[] strArray = elementsAsString.toString().split(",");
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = Integer.parseInt(strArray[i]);
		}
		return resultArray;
	}

	public static int[] cleverDeleteNth(int[] elements, int maxOccurrences) {
		// Code here
		if (maxOccurrences < 1)
			return new int[0];

		final HashMap<Integer, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();

		for (final Integer i : elements) {
			final Integer v = map.put(i, map.getOrDefault(i, 0) + 1);
			if (v == null || v < maxOccurrences)
				list.add(i);
		}

		return list.stream().mapToInt(i -> i).toArray();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
