package codility;
import java.util.Set;
import java.util.HashSet;
public class PermCheck_7 {
// ���̰� 0�϶��� ������ �ľ��ߴµ� ���� �Ű�ȽἭ Ʋ�Ⱦ���.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {4,3,2};
		int result = solution(A);
		System.out.println(result);
	}
	public static int solution(int[] A) {
		if(A.length == 1) {
			if(A[0] == 1) {
				return 1;
			}else {
				return 0;
			}
		}
		Set<Integer> set = new HashSet<Integer>();
		int size = A.length;
		for(int i = 0 ; i < size; i++) {
			set.add(A[i]);
		}
		for(int  i = 0 ; i < size; i++) {
			if(!set.contains(i+1)) {
				return 0;
			}
		}
		return 1;
	}
}
