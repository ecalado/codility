package codility.lessons;

import java.time.Instant;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

public class MissingInteger {

	public int solution(int[] A) {

		Iterator<Integer> array = Arrays.stream(A).distinct().filter(i -> i > 0).sorted().iterator();

		int lastValue = 0;
		while (array.hasNext()) {
			int currentValue = array.next();
			if (lastValue != currentValue - 1) {
				return lastValue + 1;
			}

			lastValue = currentValue;
		}

		return lastValue + 1;
	}

	public static void main(String[] args) {
		MissingInteger b = new MissingInteger();

		System.out.println("01 Result: " + b.solution(new int[] {}));

		System.out.println("01 Result: " + b.solution(new int[] { -997, -998, -999, -1000, 1, 9, 3, 5, 6, 7, 4 }));
		System.out.println(
				"02 Result: " + b.solution(new int[] { -1000, -999, -998, -9971, 9, 3, 5, 6, 7, 1, 2, 4, 19 }));
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

		Random random = new Random();
		int[] array = new int[10000000];
		for (int x = 0; x < 10000000; x++) {
			array[x] = random.nextInt(1000000);
		}

		System.out.println(Instant.now());
		System.out.println(b.solution(array));
		System.out.println(Instant.now());
	}
}
