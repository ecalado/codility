package codility.lessons;

import java.util.Arrays;

//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

public class PermMissingElem {

	
	public int solution(int[] A) {
		if (A.length > 0) {
			Arrays.parallelSort(A);
	
			
			for (int idx = 1; idx < A.length; idx++) {
				if (A[idx - 1] + 1 != A[idx]) {
					return A[idx - 1] + 1;
				}
			}
			
			if (A[0] == 1) {
				return A.length + 1;
			}
		}
		
		return 1;
	}

	public static void main(String[] args) {
		PermMissingElem b = new PermMissingElem();

		System.out.println("Result: " + b.solution(new int[] {}));
		System.out.println("Result: " + b.solution(new int[] { 10, 12, 13 }));
		System.out.println("Result: " + b.solution(new int[] { 1, 2 }));
		System.out.println("Result: " + b.solution(new int[] { 0, 2, 3, 4, 5 }));
		System.out.println("Result: " + b.solution(new int[] { 2, 3, 0, 1, 5 }));
		System.out.println("Result: " + b.solution(new int[] { 4, 5, 3, 2, 1, 7, 8, 9, 0 }));
		System.out.println("Result: " + b.solution(new int[] { 4, 5, 3, 10, 12, 2, 1, 6, 8, 9, 7 , 0}));

		System.out.println("Result: " + b.solution(new int[] { 1, 12, 21, 22, 23, 24, 25, 26, 13, 27, 28, 29, 30, 14, 2,
				15, 16, 17, 3, 18, 19, 20, 4, 6, 7, 8, 9, 10, 11, 0 }));

	}
}
