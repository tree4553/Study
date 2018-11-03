package codility;

public class MaxCounters_9_timeout {
// N+1 값이 들어왔을때 전체 값을 변경하는부분이 시간을 너무 많이 잡아먹는다
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
		int max = 0;
		int[] result = new int[N]; 
		for(int i = 0 ; i < size; i++) {
			if(A[i] == N+1) {
				for(int j = 0 ; j < N; j++) {
					result[j] = max;
				}
			}else {
				result[A[i]-1]++;
				if(max < result[A[i]-1]) {
					max = result[A[i]-1];
				}
			}
		}
		return result;
	}
}
