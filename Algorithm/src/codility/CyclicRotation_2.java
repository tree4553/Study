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
		// K �� �迭�� ũ�⸸ŭ ȸ���� �ݺ��ϸ� ������ �迭�� �����Ƿ� K�� size ������ ���� ������ ����ŭ ȸ����Ų��.
		int n = K % size;
		// �迭�� ������ ���� ���� �տ� �߰��ϰ� ������ ���� �����Ѵ�.
		for (int i = 0; i < n; i++) {
			arr.addFirst(arr.getLast());
			arr.removeLast();
		}
		// solution�� return ���� �迭�̹Ƿ� LinkedList�� �迭�� ������ش�.
		for (int i = 0; i < size; i++) {
			result[i] = arr.pollFirst();
		}
		return result;
	}

}
