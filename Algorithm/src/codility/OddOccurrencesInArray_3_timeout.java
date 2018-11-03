package codility;
import java.util.ArrayList;
public class OddOccurrencesInArray_3_timeout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 9, 3, 9, 3, 9, 7, 9 };
		int result = solution(A);
		System.out.println(result);
	}
	
	public static int solution(int[] A) {
		int result = 0;
		int size = A.length;
		// 배열의 값들을 ArrayList를 이용하여 처리한다.
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(A[0]);
		for(int i = 1 ; i < size; i++) {
			// arr에 A[i]값이 있는지 검사
			if(arr.contains(A[i])) {
				for(int j = 0 ; j < arr.size(); j++) {
					// A[i]값이 있다면 arr에서 제거
					if(arr.get(j) == A[i]) {
						arr.remove(j);
					}
				}
			// arr에 A[i]값이 없다면 추가
			}else {
				arr.add(A[i]);
			}
		}
		return arr.get(0);
	}
}
