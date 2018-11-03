package codility;

public class TapeEquilibrium_6 {
// 초기화 시키기 위해 한번 실행시키고 for문의 범위를 조절하지 않았어 틀렸었다.
// 배열의 길이가 1일때, 2일때 값이 제대로 나오지 않아서 틀렸었다.
// for문의 경계값이 달라서 틀렸었다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { -10,-20,-30,-40,100 };
		int result = solution(A);
		System.out.println(result);
	}

	public static int solution(int[] A) {
		if (A.length == 1) {
			return A[0];
		}
		if (A.length == 2) {
			return Math.abs(A[0] - A[1]);
		}
		int result = 0, sum = 0, left = 0, right = 0, temp = 0;
		int size = A.length;
		for (int i = 0; i < size; i++) {
			sum += A[i];
		}

		left += A[0];
		right = sum - left;
		result = Math.abs(left - right);

		for (int i = 1; i < size-1; i++) {
			left += A[i];
			right = sum - left;
			temp = Math.abs(left - right);
			if (result > temp) {
				result = temp;
			}
		}
		return result;
	}
}
