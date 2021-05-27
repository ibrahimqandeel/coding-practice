package code.war.challenges.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PipeProblem {

    public static int[] pipeFix(int[] numbers) {
        int diff = numbers[numbers.length - 1] - numbers[0];
        int[] pipes = new int[diff + 1];

        pipes[0] = numbers[0];
        for (int i = 1; i < pipes.length; i++) {
            pipes[i] = pipes[i - 1] + 1;
        }

        return pipes;
    }

    @Test
    public void pipeFixTest() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, pipeFix(new int[]{1, 2, 3, 5, 6, 8, 9}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, pipeFix(new int[]{1, 2, 3, 12}));
        assertArrayEquals(new int[]{6, 7, 8, 9}, pipeFix(new int[]{6, 9}));
        assertArrayEquals(new int[]{-1, 0, 1, 2, 3, 4}, pipeFix(new int[]{-1, 4}));
        assertArrayEquals(new int[]{1, 2, 3}, pipeFix(new int[]{1, 2, 3}));
    }
}
