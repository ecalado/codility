package codility.lessons;

//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

public class FrogJmp {

	public int solution(int X, int Y, int D) {
		int mod = Math.floorMod(Y - X, D);
		
		if (mod != 0) {
			return Math.floorDiv(Y - X + D - mod, D);
		}

		return Math.floorDiv(Y - X, D);
	}

	public static void main(String[] args) {
		FrogJmp b = new FrogJmp();
		System.out.println(b.solution(10, 80, 30));
		System.out.println(b.solution(10, 85, 30));
		System.out.println(b.solution(10, 50, 30));
		System.out.println(b.solution(10, 70, 30));
		System.out.println(b.solution(10, 120, 30));
		System.out.println(b.solution(10, 140, 30));
		System.out.println(b.solution(10, 100, 30));
	}
}
