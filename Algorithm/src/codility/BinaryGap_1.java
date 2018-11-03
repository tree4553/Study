package codility;

public class BinaryGap_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(561892));
	}

	public static int solution(int N) {
		if (N < 5) {
			return 0;
		}
		String binary = Integer.toBinaryString(N);
		int result = 0, temp = 0;
		int size = binary.length();
		for (int i = 0; i < size; i++) {
			if (binary.charAt(i) == '0') {
				temp++;
			} else {
				if (result < temp) {
					result = temp;
				}
				temp = 0;
			}
		}
		return result;
	}
}
