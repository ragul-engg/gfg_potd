package september;

import java.util.ArrayList;

public class RotateBits {
	private static ArrayList<Integer> rotate(int N, int D) {
		ArrayList<Integer> result = new ArrayList<>();
		D %= 16;
		result.add((N << D | N >> (16 - D)) & 65535);
		result.add((N >> D | N << (16 - D)) & 65535);
		return result;
	}

	public static void main(String[] args) {
		int N = 29;
		int D = 2;
		System.out.println(rotate(N, D));
	}
}
