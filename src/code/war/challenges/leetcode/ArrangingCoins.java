package code.war.challenges.leetcode;
/*
 * @link https://leetcode.com/problems/arranging-coins/
 */

import java.util.HashMap;

public class ArrangingCoins {
    public int arrangeCoins(int n) {
        int levels = 0;
        for (int i = 0; i < n; i++) {
            levels++;
            n = n - levels;
            if (n == 0) {
                return levels;
            }
        }

        return levels;
    }

    public static void main(String[] args) {
        ArrangingCoins arrangingCoins = new ArrangingCoins();
        System.out.println(arrangingCoins.arrangeCoins(0));
        System.out.println(arrangingCoins.arrangeCoins(1));
        System.out.println(arrangingCoins.arrangeCoins(5));
        System.out.println(arrangingCoins.arrangeCoins(8));
    }
}