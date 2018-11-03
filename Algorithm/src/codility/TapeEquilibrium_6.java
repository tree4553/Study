package codility;

public class TapeEquilibrium_6 {

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
