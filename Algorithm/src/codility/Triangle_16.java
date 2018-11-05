package codility;

import java.util.Arrays;

public class Triangle_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 5,3,3 };
		int result = solution(A);
		System.out.println(result);
	}

	public static int solution(int[] A) {
		int result = 0;
		int size = A.length;
		Arrays.sort(A);
		for (int i = 0; i < size - 2; i++) {
			if (A[i] > 0 && A[i + 1] > 0 && A[i + 2] > 0) {
				if (A[i] > A[i + 2] - A[i + 1]) {
					if (A[i + 1] > A[i] - A[i + 2]) {
						if (A[i + 2] > A[i + 1] - A[i]) {
							result = 1;
							return result;
						}
					}
				}
			}
		}
		return result;
	}
}
