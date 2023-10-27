package be5_day12_DSA;

import java.util.Scanner;

public class SquareInteger {

	public static void main(String[] args) {
		// 1<= q <=100
		// 1<= a<=b <= 1 ty, 10^9

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter how many times you wanna test: ");
		int testCases = keyboard.nextInt();

		int startNum = 0;
		int endNum = 0;

		int i = 0;
		int time = 0;

		// O(n)
		while (i < testCases) {
			System.out.print("Start Number: ");
			startNum = keyboard.nextInt();

			System.out.print("End Number: ");
			endNum = keyboard.nextInt();

			time = findSquareInteger(startNum, endNum);
			System.out.println("time: " + time);
			i++;
		}

	}
	// TIME COMPLEXITY: On

	private static int findSquareInteger(int startNum, int endNum) {

		int root = startNum;
		int squareNumber = root * root;
		int time = 0;

		// O(n)
		while (squareNumber <= endNum) {

			System.out.print("root: " + root + " , ");
			root++;
			squareNumber = root * root;
			time++;
		}
		return time;

	}

}
