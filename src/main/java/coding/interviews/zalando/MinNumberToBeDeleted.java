package coding.interviews.zalando;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

//https://leetcode.com/problems/minimum-deletions-to-make-character-frequencies-unique/
public class MinNumberToBeDeleted {

    public static int minDeletions(String input) {
        // write your code in Java SE 8
        int minNum = 0;
        int[] charFrequencyArray = new int[26];
        Set<Integer> repeatSet = new HashSet<>();
        for (char element : input.toCharArray()) {
            charFrequencyArray[element - 97]++;
        }
        int frequency;
        for (int i = 0; i < charFrequencyArray.length; i++) {
            frequency = charFrequencyArray[i];
            while (frequency != 0 && repeatSet.contains(frequency)) {
                frequency--;
                minNum++;
            }
            repeatSet.add(frequency);
        }
        return minNum;
    }

//    private static List<Integer> sortMapValues(Map charsMap) {
//        List<Integer> orderedList = new ArrayList<Integer>(charsMap.values());
//        return orderedList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//    }

    @Test
    public void test() {
        assertEquals(0, minDeletions("aa"));//2
        assertEquals(0, minDeletions("abb"));//2,1
        assertEquals(0, minDeletions("dddabbcccddd")); //6,3,2,1
        assertEquals(1, minDeletions("aaaabbbb"));//4,4
        assertEquals(2, minDeletions("ccaaafff"));//3,3,2
        assertEquals(3, minDeletions("abccddffff"));//4,2,2,1,1
        assertEquals(4, minDeletions("ccaaffdeee"));//3,2,2,2,1
        assertEquals(6, minDeletions("ccaaffddecee"));//3,3,2,2,2
    }
}