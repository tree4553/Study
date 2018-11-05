package codility;

public class NumberOfDiscIntersections_18_timeout {
// 오버플로우 체크 안함
// 성능 부족
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 1, 5, 2, 1, 4, 0 };
		int result = solution(A);
		System.out.println(result);
	}

	public static int solution(int[] A) {
		int result = 0;
		int size = A.length;
		int[][] arr = new int[size][2];
		for (int i = 0; i < size; i++) {
			arr[i][0] = i - A[i];
			arr[i][1] = i + A[i];
		}
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if(arr[i][0] <= arr[j][0]) {
					if(arr[i][1] >= arr[j][0]) {
						result++;
					}
				}else if(arr[i][0] >= arr[j][0]){
					result++;
				}
			}
		}
		if (result > 10000000) {
			return -1;
		}
		return result;
	}
}
