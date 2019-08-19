package com.slr.leetcode;

/**
 * https://leetcode.com/problems/robot-return-to-origin/
 */
public class RobotReturnToOrigin {


	public static void main(String[] args) {
		System.out.println(judgeCircle("LL"));
		System.out.println(judgeCircle("UD"));
		System.out.println(judgeCircle("LR"));
	}


	public static boolean judgeCircle(String moves) {

		int currentPositionOnXAxis = 0;
		int currentPositionOnYAxis = 0;

		for (int i = 0; i < moves.length(); i++) {
			char c = moves.charAt(i);

			switch (c) {
				case 'L':
					currentPositionOnXAxis--;
					break;
				case 'R':
					currentPositionOnXAxis++;
					break;
				case 'U':
					currentPositionOnYAxis++;
					break;
				case 'D':
					currentPositionOnYAxis--;
					break;
				default:
					throw new IllegalArgumentException("Not a valid move");
			}

		}

		if (currentPositionOnXAxis == 0 && currentPositionOnYAxis == 0) {
			return true;
		}

		return false;
	}
}
