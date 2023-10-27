package be5_day12_DSA;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberAppearOddTimes {
	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 100, 400, 15, 15, 15, 15, 15, 15, 15, 15 };

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		int[] timeAppear = new int[array.length];

		int i = 0;

		// TIME COMPLEXITY: O(n^2)

		while (i < array.length) {
			int number = array[i];
			int j;

			for (j = 0; j < numbers.size(); j++) {

				if (number == numbers.get(j)) {
					timeAppear[j]++;
					break;
				}
			}
			if (j == numbers.size()) {
				numbers.add(number);
				timeAppear[j] = 1;
			}
			i++;
		}

		for (int k = 0; k < numbers.size(); k++) {
			if (timeAppear[k] % 2 != 0) {
				System.out.println(numbers.get(k));
			}
		}
		System.out.println(Arrays.toString(timeAppear));
	}

}

//