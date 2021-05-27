package code.war.challenges.kata;

/*
 * 
Count the number of Duplicates

Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. 
The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.

Example
"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice
 */

public class CountingDuplicates {

	/**
	 * 
	 * @param String text
	 * @return Count of distinct case-insensitive alphabetic characters and numeric
	 *         digits that occur more than once in the input string.
	 * 
	 * @solution convert ASCII code for each char to an array index and increase the
	 *           value of that index by 1 for every occurs of that char in the
	 *           String
	 */
	public static int duplicateCount(String text) {
		// Write your code here
		text = text.toUpperCase();
		int counter = 0;
		int[] charArray = new int[43];
		char charValue;
		int index;

		for (int i = 0; i < text.length(); i++) {
			charValue = text.charAt(i);
			index = (charValue - 90) + 42;
			charArray[index]++;
			if (charArray[index] == 2) {
				counter++;
			}
		}
		return counter;
	}

	public static int cleverDuplicateCount(String text) {
		// Write your code here
		int[] asciiCharArray = new int[127];
		int counter = 0;
		for (byte c : text.toLowerCase().getBytes()) {
			if (++asciiCharArray[c] == 2)
				counter++;
		}
		return counter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n\t\t\t\t\t\t ***************** Count the number of Duplicates ***************** \n\n");
	}
}