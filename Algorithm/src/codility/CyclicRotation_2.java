package codility;

import java.util.LinkedList;

public class CyclicRotation_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 3, 8, 9, 7, 6 };
		int K = 3;
		int size = A.length;
		A = solution(A, K);
		for (int i = 0; i < size; i++) {
			System.out.printf(A[i] + " ");
		}
		
	}

	public static int[] solution(int[] A, int K) {
		if(A.length == 0) {
			return A;
		}
		LinkedList<Integer> arr = new LinkedList<Integer>();
		int size = A.length;
		int[] result = new int[size];
		for (int i = 0; i < size; i++) {
			arr.add(A[i]);
		}
		// K 가 배열의 크기만큼 회전을 반복하면 원래의 배열과 같으므로 K를 size 값으로 나눈 나머지 값만큼 회전시킨다.
		int n = K % size;
		// 배열의 마지막 값을 가장 앞에 추가하고 마지막 값을 제거한다.
		for (int i = 0; i < n; i++) {
			arr.addFirst(arr.getLast());
			arr.removeLast();
		}
		// solution의 return 값이 배열이므로 LinkedList를 배열로 만들어준다.
		for (int i = 0; i < size; i++) {
			result[i] = arr.pollFirst();
		}
		return result;
	}

}
