package codility;

import java.util.HashMap;

public class FrogRiverOne_8_RunTimeError {
// 시작할때가 0초인데 1로 잡아서 틀림
// 도달 하지 못하는 조건에는 -1을 반환해야 하는데 조건을 반영하지 않음
// A의 원소가 1개 일때 X가 1 이고 A[0]가 1일때 0을 반환하고 나머지는 -1을 반환해야하는 것을 생각못함
// 배열을 사용해서 풀려고 하니 배열의 크기가 100000과 같은 큰값이 들어왔을대 런타임 에러를 만든다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X = 3;
		int[] A = { 1, 2, 3, 4, 2, 3, 5, 4 };
		int result = solution(X, A);
		System.out.println(result);
	}

	public static int solution(int X, int[] A) {
		if(A.length == 1) {
			if(X == 1 && A[0] == 1) {
				return 0;
			}else {
				return -1;
			}
		}
		int time = 0, bridge = 0;
		int size = A.length;
		boolean[] arr = new boolean[size];
		for (int i = 0; i < size; i++) {
			if(A[i] <= X && arr[A[i]] == false) {
				bridge++;
				arr[A[i]] = true;
				if(bridge == X) {
					return i;
				}
			}
			time++;
		}
		return -1;
	}
}
