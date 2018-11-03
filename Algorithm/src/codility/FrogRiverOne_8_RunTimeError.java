package codility;

import java.util.HashMap;

public class FrogRiverOne_8_RunTimeError {
// �����Ҷ��� 0���ε� 1�� ��Ƽ� Ʋ��
// ���� ���� ���ϴ� ���ǿ��� -1�� ��ȯ�ؾ� �ϴµ� ������ �ݿ����� ����
// A�� ���Ұ� 1�� �϶� X�� 1 �̰� A[0]�� 1�϶� 0�� ��ȯ�ϰ� �������� -1�� ��ȯ�ؾ��ϴ� ���� ��������
// �迭�� ����ؼ� Ǯ���� �ϴ� �迭�� ũ�Ⱑ 100000�� ���� ū���� �������� ��Ÿ�� ������ �����.
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
