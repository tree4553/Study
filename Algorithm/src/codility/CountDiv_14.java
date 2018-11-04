package codility;

public class CountDiv_14 {
// A가 0일때를 신경 안써서 틀림
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 0, B = 1, K = 11;
		int result = solution(A, B, K);
		System.out.println(result);
	}

	public static int solution(int A, int B, int K) {
		int result = 0;
		int x, y;
		if (A % K == 0 && A != 0) {
			x = A / K - 1;
		} else {
			x = A / K;
		}
		if (B % K == 0) {
			y = B / K + 1;
		} else {
			y = B / K;
		}
		result = y - x;
		return result;
	}
}
