package codility;
import java.util.HashSet;
public class GenomicRangeQuery_12_timeout {
// HashSet의 add와 contains를 이용하여 풀려했는데 성능 부족
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "CAGCATA";
		int[] P = {2,5,0};
		int[] Q = {4,5,6};
		int[] result = new int[P.length];
		result = solution(S, P, Q);
		for(int i = 0 ; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	public static int[] solution (String S, int[] P, int[] Q) {
		int size = P.length;
		int[] result = new int[size];
		for(int i = 0 ; i < size; i++) {
			HashSet<Character> set = new HashSet<Character>();
			for(int j = P[i]; j <= Q[i] ; j++) {
				if(S.charAt(j)=='A') {
					result[i] = 1;
					break;
				}
				set.add(S.charAt(j));
			}
			if(set.contains('C')) {
				result[i] = 2;
			}else if(set.contains('G')) {
				result[i] = 3;
			}else {
				result[i] = 4;
			}
		}
		return result;
	}
}
