package codility.lessons;

import java.util.Arrays;

//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

public class TapeEquilibrium {

	public int solution(int[] A) {
		// write your code in Java SE 8
		int part1Sum = 0;
		int part2Sum = Arrays.stream(A).sum();

		Integer subtraction = null;

		int idx = 0;
		
		do {
			part1Sum += A[idx];
			part2Sum -= A[idx];

			int test = Math.abs(part1Sum - part2Sum);

			if (subtraction == null || test < subtraction) {
				if (test == 0) {
					return test;
				}

				subtraction = test;
			}
			
			idx++;
		} while(idx < A.length -1);

		return subtraction;
	}

	public static void main(String[] args) {
		TapeEquilibrium b = new TapeEquilibrium();

		System.out.println("01 Result: " + b.solution(new int[] { -997, -998, -999, -1000 }));
		System.out.println("02 Result: " + b.solution(new int[] { -1000, -999, -998, -997 }));
		System.out.println("03 Result: " + b.solution(new int[] { -1, 0 }));
		System.out.println("04 Result: " + b.solution(new int[] { 0, 1 }));
		System.out.println("05 Result: " + b.solution(new int[] { 3, 3 }));
		System.out.println("06 Result: " + b.solution(new int[] { 1000, 0, 0, -1 }));
		System.out.println("07 Result: " + b.solution(new int[] { -1000, 980 }));
		System.out.println("08 Result: " + b.solution(new int[] { 1, 20001 }));
		System.out.println("09 Result: " + b.solution(new int[] { -1000, 1000 }));
		System.out.println("10 Result: " + b.solution(new int[] { 20001, 1 }));
		System.out.println("11 Result: " + b.solution(new int[] { 3, 4, 2, 1, 3 }));
		System.out.println("12 Result: " + b.solution(new int[] { 3, 1, 2, 4, 3 }));
		System.out.println("13 Result: " + b.solution(new int[] { 5, 4, 2, 5, 4 }));
		System.out.println("14 Result: " + b.solution(new int[] { 4, 5, 2, 4, 5 }));

	}
}
