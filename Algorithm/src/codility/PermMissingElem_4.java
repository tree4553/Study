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
		// 비어있는 한칸이 존재할 수 있기 때문에 size+1의 크기로 배열을 만든다.
		int[] arr = new int[size+1];
		// arr를 채운다.
		for (int i = 0; i < size; i++) {
			arr[A[i]-1] = 1;
		}
		// arr에서 값이 0 인 값을 반환한다.
		for (int i = 0; i < size; i++) {
			if (arr[i] == 0) {
				return i+1;
			}
		}
		// 비어있는 숫자가 없다면 size+1 값을 반환한다.
		return size+1;
	}
}
