package codility;

public class PermMissingElem_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 2, 3, 1, 5 };
		int result = solution(A);
		System.out.println(result);
	}

	public static int solution(int[] A) {
		int size = A.length;
		// ����ִ� ��ĭ�� ������ �� �ֱ� ������ size+1�� ũ��� �迭�� �����.
		int[] arr = new int[size+1];
		// arr�� ä���.
		for (int i = 0; i < size; i++) {
			arr[A[i]-1] = 1;
		}
		// arr���� ���� 0 �� ���� ��ȯ�Ѵ�.
		for (int i = 0; i < size; i++) {
			if (arr[i] == 0) {
				return i+1;
			}
		}
		// ����ִ� ���ڰ� ���ٸ� size+1 ���� ��ȯ�Ѵ�.
		return size+1;
	}
}
