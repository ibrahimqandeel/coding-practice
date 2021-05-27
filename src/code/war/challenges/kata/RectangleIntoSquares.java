package code.war.challenges.kata;

/*
 * @link https://www.codewars.com/kata/55466989aeecab5aac00003e/java
 */

import java.util.ArrayList;
import java.util.List;

public class RectangleIntoSquares {

	public static List<Integer> sqInRect(int lng, int wdth) {
		// your code
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		if (lng == wdth) {
			return null;
		}
		while (wdth != lng) {
			if (wdth > lng) {
				resultList.add(lng);
				wdth = wdth - lng;
			} else if (lng > wdth) {
				resultList.add(wdth);
				lng = lng - wdth;
			}
			if (wdth == lng) {
				resultList.add(wdth);
			}
		}

		return resultList;
	}

	public static List<Integer> cleverSqInRect(int lng, int wdth) {
		// your code
		if (lng == wdth) {
			return null;
		}
		ArrayList<Integer> squares = new ArrayList<Integer>();
		int area = lng * wdth;
		while (area > 0) {
			squares.add(Math.min(lng, wdth));
			if (wdth > lng) {
				wdth = wdth - lng;
			} else {
				lng = lng - wdth;
			}
			area = lng * wdth;
		}

		return squares;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sqInRect(9, 3));

	}

}
