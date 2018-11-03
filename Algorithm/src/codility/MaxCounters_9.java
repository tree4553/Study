package codility;

public class MaxCounters_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		int[] A = {1,2,3,4,5,1,1,1,6,2};
		int size = A.length;
		A=solution(N,A);
		for(int i = 0 ; i < N; i++) {
			System.out.println(A[i]);
		}
	}
	public static int[] solution(int N,int[] A) {
		int size = A.length;
		int tmpMax = 0, doneMax = 0;
		int[] result = new int[N]; 
		for(int i = 0 ; i < size; i++) {
			if(A[i] == N+1) {
				doneMax = tmpMax;
			}else {
				if(result[A[i]-1] < doneMax) {
					result[A[i]-1] = doneMax;
				}
				result[A[i]-1]++;
				if(result[A[i]-1]>tmpMax) {
					tmpMax = result[A[i]-1];
				}
			}
		}
		if(doneMax > 0) {
			for(int i = 0 ; i < N; i++) {
				if(result[i] < doneMax) {
					result[i] = doneMax;
				}
			}
		}
		return result;
	}
}
