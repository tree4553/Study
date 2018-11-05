package codility;
import java.util.Arrays;
public class MaxProductOfThree_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {-3,1,2,-2,5,6};
		int result = solution(A);
		System.out.println(result);
	}
	public static int solution(int[] A) {
		int result = 0;
		int size = A.length;
		Arrays.sort(A);
		int a = A[0] * A[1] * A[size-1];
		int b = A[size-1]*A[size-2]*A[size-3];
		if(a>b) {
			result = a;
		}else {
			result = b;
		}
		return result;
	}
}
