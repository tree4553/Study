package codility;

public class MinAvgTwoSlice_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 4, 2, 2, 5, 1, 5, 8 };
		int result = solution(A);
		System.out.println(result);
	}

	public static int solution(int[] A) {
		int result = 0;
		double minAvg = (A[0] + A[1]) / 2.0;
		for (int i = 2; i < A.length; i++) {
			double avg = (A[i - 1] + A[i]) / 2.0;
			if (avg < minAvg) {
				minAvg = avg;
				result = i - 1;
			}
			avg = (A[i - 2] + A[i - 1] + A[i]) / 3.0;
			if (avg < minAvg) {
				minAvg = avg;
				result = i - 2;
			}
		}
		return result;
	}
}
