package codility.lessons;

import java.time.Instant;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

public class FrogRiverOne {

	public int solution(int X, int[] A) {
		Set<Integer> itens = IntStream.rangeClosed(1, X).boxed().collect(Collectors.toSet());
		int count = 0;

		for (int item : A) {
			itens.remove(item);

			if (itens.isEmpty()) {
				return count;
			}

			count++;
		}

		return -1;
	}

	public static void main(String[] args) {
		FrogRiverOne b = new FrogRiverOne();
		System.out.println(b.solution(5, new int[] { 1, 3, 1, 4, 2, 3, 5, 4 }));

		System.out.println(b.solution(3, new int[] { 1, 3, 1, 4, 2, 3, 5, 4 }));

		System.out.println(b.solution(3, new int[] { 1, 3, 1, 4, 4, 3, 5, 4 }));
		System.out.println(b.solution(1, new int[] { 1, 3 }));
		System.out.println(b.solution(1, new int[] {}));
		System.out.println(b.solution(2, new int[] {}));
		System.out.println(b.solution(2, new int[] { 3, 1, 4, 2 }));
		System.out.println(b.solution(2, new int[] { 1, 1, 1, 1 }));
		Random random = new Random();
		int[] array = new int[100000000];
		for (int x = 0; x < 100000000; x++) {
			array[x] = random.nextInt(10000000);
		}
		System.out.println(Instant.now());
		System.out.println(b.solution(10000, array));
		System.out.println(Instant.now());
	}
}
