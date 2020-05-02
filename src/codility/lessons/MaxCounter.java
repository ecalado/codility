package codility.lessons;

import java.util.Arrays;

//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

public class MaxCounter {
	public int[] solution(int N, int[] A) {
		// write your code in Java SE 8
		int[] result = new int[N];
		int count = 0;
		for (int item : A) {
			if (item <= N) {
				result[item-1]++;
			} else {
				int[] value = new int[] { count - 1 };
				Arrays.parallelSetAll(result, e -> {
					return value[0];
				});
			}
			count++;
		}

		return result;
	}

	public static void main(String[] args) {
		MaxCounter b = new MaxCounter();
		System.out.println(Arrays.toString(b.solution(5, new int[] { 6, 6, 6, 6, 6, 6, 6 })));
		System.out.println(Arrays.toString(b.solution(5, new int[] { 3, 4, 4, 6, 1, 4, 4 })));
		System.out.println(Arrays.toString(b.solution(5, new int[] { 3})));
	}
}
