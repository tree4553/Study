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
		// �迭�� ������ ArrayList�� �̿��Ͽ� ó���Ѵ�.
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(A[0]);
		for(int i = 1 ; i < size; i++) {
			// arr�� A[i]���� �ִ��� �˻�
			if(arr.contains(A[i])) {
				for(int j = 0 ; j < arr.size(); j++) {
					// A[i]���� �ִٸ� arr���� ����
					if(arr.get(j) == A[i]) {
						arr.remove(j);
					}
				}
			// arr�� A[i]���� ���ٸ� �߰�
			}else {
				arr.add(A[i]);
			}
		}
		return arr.get(0);
	}
}
