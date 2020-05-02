package codility.lessons;

//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

public class BinaryGap {

	public int solution(int N) {
		String number = Integer.toBinaryString(N);

		if (number.contains("1") && number.contains("0")) {
			String newNumber = number;
			int lastPosition = number.indexOf("1");
			int currentPosition = lastPosition;
			int count = 0;
			while (currentPosition >= 0) {
				newNumber = newNumber.substring(lastPosition + 1);

				currentPosition = newNumber.indexOf("1");

				if (currentPosition > 0) {
					if (currentPosition > count) {
						count = currentPosition;
					}
				}

				lastPosition = currentPosition;
			}

			return count;
		}

		return 0;
	}

	public static void main(String[] args) {
		BinaryGap b = new BinaryGap();
		System.out.println("Binary: " + Integer.toBinaryString(328) + " | Result:" + b.solution(328));
		System.out.println("Binary: " + Integer.toBinaryString(1162) + " | Result:" + b.solution(1162));
		System.out.println("Binary: " + Integer.toBinaryString(66561) + " | Result:" + b.solution(66561));
		System.out.println("Binary: " + Integer.toBinaryString(1376796946) + " | Result:" + b.solution(1376796946));
		
		
		System.out.println("Binary: " + Integer.toBinaryString(5) + " | Result:" + b.solution(5));
		System.out.println("Binary: " + Integer.toBinaryString(10) + " | Result:" + b.solution(10));
		System.out.println("Binary: " + Integer.toBinaryString(9) + " | Result:" + b.solution(9));
		System.out.println("Binary: " + Integer.toBinaryString(100) + " | Result:" + b.solution(100));
		System.out.println("Binary: " + Integer.toBinaryString(1000) + " | Result:" + b.solution(1000));
		System.out.println("Binary: " + Integer.toBinaryString(35) + " | Result:" + b.solution(35));
		System.out.println("Binary: " + Integer.toBinaryString(20) + " | Result:" + b.solution(20));
		System.out.println("Binary: " + Integer.toBinaryString(1041) + " | Result:" + b.solution(1041));
		System.out.println("Binary: " + Integer.toBinaryString(32) + " | Result:" + b.solution(32));
		System.out.println("Binary: " + Integer.toBinaryString(1001) + " | Result:" + b.solution(1001));
		System.out.println("Binary: " + Integer.toBinaryString(12) + " | Result:" + b.solution(12));
		System.out.println("Binary: " + Integer.toBinaryString(988584884) + " | Result:" + b.solution(988584884));
		System.out.println("Binary: " + Integer.toBinaryString(44751548) + " | Result:" + b.solution(44751548));
	}
}
