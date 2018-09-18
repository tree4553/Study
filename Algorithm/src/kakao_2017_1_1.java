//2017년 카카오 코딩테스트 1차 1번 문제

public class kakao_2017_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] temp = solution(5, new int[] { 9, 20, 28, 18, 11 }, new int[] { 30, 1, 21, 17, 28 });
		for (int i = 0; i < 5; i++) {
			System.out.println(temp[i]);
		}

		System.out.println();

		temp = solution(6, new int[] { 46, 33, 33, 22, 31, 50 }, new int[] { 27, 56, 19, 14, 14, 10 });
		for (int i = 0; i < 6; i++) {
			System.out.println(temp[i]);
		}
		solution(5, new int[] { 9, 20, 28, 18, 11 }, new int[] { 30, 1, 21, 17, 28 });

		solution(6, new int[] { 46, 33, 33, 22, 31, 50 }, new int[] { 27, 56, 19, 14, 14, 10 });

	}

	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		for (int i = 0; i < n; i++) {
			int and_num = arr1[i] | arr2[i];
			int target_bit = 1;
			String result = "";
			for (int j = 0; j < n; j++) {
				result = ((and_num & target_bit) > 0 ? "#" : " ") + result;
				target_bit = target_bit << 1;
			}
			answer[i] = result;
		}
		return answer;
	}
}
