package code.war.challenges.leetcode;
/*
 * @link https://leetcode.com/problems/roman-to-integer/
 */
import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        HashMap<String, Integer> romanCharsMap = new HashMap();
        romanCharsMap.put("I", 1);
        romanCharsMap.put("IV", 4);
        romanCharsMap.put("V", 5);
        romanCharsMap.put("IX", 9);
        romanCharsMap.put("X", 10);
        romanCharsMap.put("XL", 40);
        romanCharsMap.put("L", 50);
        romanCharsMap.put("XC", 90);
        romanCharsMap.put("C", 100);
        romanCharsMap.put("CD", 400);
        romanCharsMap.put("D", 500);
        romanCharsMap.put("CM", 900);
        romanCharsMap.put("M", 1000);

        int result = 0;
        String mapKey = "";
        for (int i = 0; i < s.length(); i++) {//DCXXI
            mapKey = "";
            if ((i + 1) < s.length()) {
                mapKey = s.substring(i, i + 2);
            }
            if (!romanCharsMap.containsKey(mapKey)) {//DC, CX
                mapKey = s.charAt(i) + "";//D,C
            } else {
                i++;
            }
            result += romanCharsMap.get(mapKey);//500+
        }
        return result;
    }

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInt("III"));
        System.out.println(romanToInteger.romanToInt("IV"));
        System.out.println(romanToInteger.romanToInt("IX"));
        System.out.println(romanToInteger.romanToInt("LVIII"));
        System.out.println(romanToInteger.romanToInt("MCMXCIV"));
        System.out.println(romanToInteger.romanToInt("DCXXI"));
    }
}