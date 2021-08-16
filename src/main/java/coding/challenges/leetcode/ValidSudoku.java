package coding.challenges.leetcode;

/**
 * @link https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/769/
 */

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        if (!validateSubArray(board)) {
            return false;
        }

        if (!validateRows(board)) {
            return false;
        }

        if (!validateColumns(board)) {
            return false;
        }

        return true;
    }

    private boolean validateRows(char[][] board) {
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != '.' && !characterSet.add(board[i][j])) {
                    return false;
                }
            }
            characterSet.clear();
        }

        return true;
    }

    private boolean validateColumns(char[][] board) {
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] != '.' && !characterSet.add(board[j][i])) {
                    return false;
                }
            }
            characterSet.clear();
        }
        return true;
    }

    private boolean validateSubArray(char[][] board) {
        Set<Character> characterSet = new HashSet<>();
        int rawStart = 0;
        int rawEnd = 3;

        int columnStart = 0;
        int columnEnd = 3;
        for (int h = 0; h < 3; h++) {
            for (int k = 0; k < 3; k++) {
                for (int i = rawStart; i < rawEnd; i++) {
                    for (int j = columnStart; j < columnEnd; j++) {
                        if (board[i][j] != '.' && !characterSet.add(board[i][j])) {
                            return false;
                        }
                    }
                }
                characterSet.clear();
                columnStart = columnEnd;
                columnEnd += 3;
            }
            rawStart = rawEnd;
            rawEnd += 3;
            columnStart = 0;
            columnEnd = 3;
        }
        return true;
    }

    @Test
    public void test() {
        char[][] board = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        assertEquals(true, isValidSudoku(board));

    }

    public static void main(String[] args) {

//        validateSubArray(board);
//        System.out.println(isValidSudoku(board));
    }
}
