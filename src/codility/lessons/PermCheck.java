package codility.lessons;

import java.time.Instant;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

public class PermCheck {

	public int solution(int[] A) {
		// write your code in Java SE 8
		if (A != null && A.length > 0) {
			IntStream array = Arrays.stream(A).distinct();
			if (A.length != array.count()) {
				return 0;
			}

			Arrays.sort(A);
			if (A[0] != 1) {
				return 0;
			}

			if (A[A.length - 1] != A.length) {
				return 0;
			}

			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		PermCheck b = new PermCheck();

		System.out.println("01 Result: " + b.solution(new int[] {}));
		System.out.println("02 Result: " + b.solution(new int[] { 4, 1, 3, 2 }));
		System.out.println("03 Result: " + b.solution(new int[] { 4, 1, 3 }));

		Random random = new Random();
		int[] array = new int[1000000];
		for (int x = 0; x < 1000000; x++) {
			array[x] = random.nextInt(1000000);
		}

		System.out.println(Instant.now());
		System.out.println(b.solution(array));
		System.out.println(Instant.now());

		int[] array2 = new int[1000000];
		for (int x = 0; x < 1000000; x++) {
			array2[x] = x + 1;
		}
		System.out.println(Instant.now());
		System.out.println(b.solution(array2));
		System.out.println(Instant.now());
	}
}
