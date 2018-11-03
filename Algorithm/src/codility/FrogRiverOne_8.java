package codility;

import java.util.HashSet;

public class FrogRiverOne_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X = 3;
		int[] A = { 1, 2, 3, 4, 2, 3, 5, 4 };
		int result = solution(X, A);
		System.out.println(result);
	}

	public static int solution(int X, int[] A) {
		HashSet<Integer> set = new HashSet<Integer>();
		int size = A.length;
		int time = 0;
		for (int i = 0; i < size; i++) {
			if (A[i] <= X) {
				set.add(A[i]);
				if(set.size() == X) {
					return i;
				}
			}
		}
		return -1;
	}
}
