//2017년 카카오 코딩테스트 1차 1번 문제

public class kakao_2017_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		solution(5,new int[] {9,20,28,18,11},new int[] {30,1,21,17,28});
		solution(6,new int[] {46,33,33,22,31,50},new int[] {27,56,19,14,14,10});
		
	}
	
	public static void solution(int n , int[] arr1, int[] arr2) {
		for(int i = 0 ; i < n ; i++) {
			String bit_and = Integer.toBinaryString(arr1[i]|arr2[i]);
			String result = bit_and.replaceAll("1", "#").replaceAll("0", " ");
			System.out.println(result);
		}
		return ;
	}
}
