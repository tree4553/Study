package codility;
import java.util.HashSet;
public class Distinct_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {2,1,2,3,1};
		int result = solution(A);
		System.out.println(result);
	}
	public static int solution(int[] A) {
		int result = 0;
		HashSet<Integer> hash = new HashSet<Integer>();
		int size = A.length;
		for(int i = 0 ; i < size; i++) {
			hash.add(A[i]);
		}
		result = hash.size();
		return result;
	}
}
