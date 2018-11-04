package codility;

public class PassingCars_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 0, 1, 0, 1, 1 };
		int result = solution(A);
		System.out.println(result);
	}

	public static int solution(int[] A) {
		int result = 0;
		int totalOne = 0;
		int size = A.length;
		for(int i= 0 ; i < size; i++) {
			if(A[i] == 1) {
				totalOne++;
			}
		}
		for(int i = 0  ; i < size; i++) {
			if(A[i] == 0) {
				result += totalOne;
				if(result > 1000000000) {
					return -1;
				}
			}else if(A[i] == 1) {
				totalOne--;
			}
		}
		return result;
	}
}
