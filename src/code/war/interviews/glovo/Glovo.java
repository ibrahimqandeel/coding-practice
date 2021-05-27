package code.war.interviews.glovo;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Glovo {

    public static String repeatedCharacter(String str) {
        if (str == null || str.length() < 2) {
            return null;
        }
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return str.charAt(i) + "";
                }
            }
        }
        return null;
    }
    // N^2
    // O(1)
    @Test
    public void test_method() {
        assertEquals("A", repeatedCharacter("ABCA"));
        // ("A", 2)
        // ("B", 2)
        assertEquals("B", repeatedCharacter("BCABA"));
        assertEquals("l", repeatedCharacter("glovol"));
        assertEquals(null, repeatedCharacter("ABC"));
        assertEquals(null, repeatedCharacter("Aa"));
        assertEquals(null, repeatedCharacter(""));


//        assertArrayEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3});
    }

    public static boolean validateBrackets(String str) {
        if (str == "") {
            return true;
        } else if (str.length() % 2 != 0) {
            return false;
        }

        Stack<String> myStack = new Stack<>();

        String bracket = "";
        for (int i = 0; i < str.length(); i++) {
            bracket = str.charAt(i) + "";
            if (bracket.equals("(") || bracket.equals("{") || bracket.equals("[")) {
                myStack.push(bracket);
            } else if (bracket.equals(")") && myStack.size() > 0 && myStack.peek().equals("(")) {
                myStack.pop();
            } else if (bracket.equals("]") && myStack.size() > 0 && myStack.peek().equals("[")) {
                myStack.pop();
            } else if (bracket.equals("}") && myStack.size() > 0 && myStack.peek().equals("{")) {
                myStack.pop();
            }
        }

        return myStack.isEmpty();
    }

    @Test
    public void test_method2() {
        assertEquals(true, validateBrackets("()"));
        assertEquals(true, validateBrackets("()[]{}"));
        assertEquals(false, validateBrackets("(]"));
        assertEquals(false, validateBrackets(")("));
        assertEquals(false, validateBrackets("([)]"));
        assertEquals(false, validateBrackets("{"));
        assertEquals(true, validateBrackets("{[]}"));
        assertEquals(false, validateBrackets("([]"));
        assertEquals(false, validateBrackets("([)])"));
        assertEquals(true, validateBrackets("(((((((((())))))))))"));
        assertEquals(true, validateBrackets(""));
    }
}
