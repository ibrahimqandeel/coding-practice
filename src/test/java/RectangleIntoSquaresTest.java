import coding.challenges.codewar.RectangleIntoSquares;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RectangleIntoSquaresTest {

    @Test
    public void sqInRecMethodTest() {
        Assertions.assertEquals(null, RectangleIntoSquares.sqInRect(5, 5));

        List<Integer> res = new ArrayList<Integer>(Arrays.asList(3, 2, 1, 1));
        for (int r : res)
            assertEquals(res, RectangleIntoSquares.sqInRect(5, 3));
    }

    @Test
    public void cleverSqInRectMethodTest1() {
        assertEquals(null, RectangleIntoSquares.cleverSqInRect(5, 5));

        List<Integer> res = new ArrayList<Integer>(Arrays.asList(3, 2, 1, 1));
        for (int r : res)
            assertEquals(res, RectangleIntoSquares.cleverSqInRect(5, 3));
    }
}
