package codility;

import java.util.HashSet;

public class MissingInteger_10 {
// N의 범위를 제대로 체크하지 못함 -> 1부터 시작, 전부 있을경우 N+1 값을 반환
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 1,2,3,4,5,6,7,8,9,10 };
		int result = solution(A);
		System.out.println(result);
	}

	public static int solution(int[] A) {
		int result = 0;
		int size = A.length;
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < size; i++) {
			if (A[i] > 0 && size+1 > A[i]) {
				set.add(A[i]);
			}
		}
		for (int i = 1; i < size+2; i++) {
			if (!set.contains(i)) {
				return i;
			}
		}
		return result;
	}
}
