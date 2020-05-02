package codility.lessons;

import java.util.Arrays;

//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

public class CiclycRotation {

	public int[] solution(int[] A, int K) {
		int[] result = A.clone();
		if (A.length > 0) {
			int rotation = Math.floorMod(K, A.length);

			if (K != A.length && K > 0 && rotation > 0) {

				for (int idx = 0; idx < A.length; idx++) {
					if (rotation + idx < A.length) {
						result[idx + rotation] = A[idx];
					} else {
						result[idx + rotation - A.length] = A[idx];
					}

				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		CiclycRotation b = new CiclycRotation();
		System.out.println("Result: " + Arrays.toString(b.solution(new int[] { 1, 2, 3, 4 }, 10)));
		System.out.println("Result: " + Arrays.toString(b.solution(new int[] { 1, 2, 3 }, 2)));
		System.out.println("Result: " + Arrays.toString(b.solution(new int[] { 1, 2, 3 }, 4)));
		System.out.println("Result: " + Arrays.toString(b.solution(new int[] { 1, 2, 3 }, 3)));
		System.out.println("Result: " + Arrays.toString(b.solution(new int[] { 3, 5, 2 }, 1)));
		System.out.println("Result: " + Arrays.toString(b.solution(new int[] { 5, 5, 5 }, 4)));
		System.out.println("Result: " + Arrays.toString(b.solution(new int[] { 1, 2, 3 }, 0)));
		System.out.println("Result: " + Arrays.toString(b.solution(new int[] { 1, 2, 3 }, 2)));
		System.out.println("Result: " + Arrays.toString(b.solution(new int[] { 1, 2, 3 }, 2)));
		System.out.println("Result: " + Arrays.toString(b.solution(new int[] {}, 2)));
	}
}
