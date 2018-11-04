package codility;

public class PassingCars_11_timeout {
// O(N^2)로 성능 부족
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 0, 1, 0, 1, 0 };
		int result = solution(A);
		System.out.println(result);
	}

	public static int solution(int[] A) {
		int result = 0;
		int size = A.length;
		for (int i = 0; i < size; i++) {
			if (A[i] == 0) {
				for (int j = i+1; j < size; j++) {
					if(A[j] == 1) {
						result++;
					}
				}
			}
		}
		return result;
	}
}
