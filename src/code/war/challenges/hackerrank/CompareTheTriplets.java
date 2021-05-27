package code.war.challenges.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareTheTriplets {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        int aliceTotalResult = 0;
        int bobTotalResult = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                aliceTotalResult++;
            } else if (a.get(i) < b.get(i)) {
                bobTotalResult++;
            }
        }
        result.add(aliceTotalResult);
        result.add(bobTotalResult);
        return result;
    }

    @Test
    public void test_compareTriplets() {
        List<Integer> aliceScore = new ArrayList<>();
        aliceScore.add(17);
        aliceScore.add(28);
        aliceScore.add(30);
        List<Integer> bobScore = new ArrayList<>();
        bobScore.add(99);
        bobScore.add(16);
        bobScore.add(8);
        List<Integer> aliceAndBobRate = new ArrayList<>();
        aliceAndBobRate.add(2);
        aliceAndBobRate.add(1);
        List<Integer> result = CompareTheTriplets.compareTriplets(aliceScore, bobScore);
        for (int i = 0; i < aliceAndBobRate.size(); i++) {
            assertEquals(aliceAndBobRate.get(i), result.get(i));
        }
    }
}
