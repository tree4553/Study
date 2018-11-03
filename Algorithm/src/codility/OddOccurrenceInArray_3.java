package codility;
import java.util.Set;
import java.util.HashSet;
public class OddOccurrenceInArray_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 9, 3, 9, 3, 9, 7, 9 };
		int result = solution(A);
		System.out.println(result);
	}
	public static int solution(int[] A) {
		Set<Integer> set = new HashSet<>();
		int size = A.length;
		for(int i = 0 ; i < size; i ++) {
			if(set.contains(A[i])) {
				set.remove(A[i]);
			}else {
				set.add(A[i]);
			}
		}
		return set.iterator().next();
	
	}
}
