package codility;

public class FrogJmp_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10, y = 85, d = 30;
		int result = solution(x, y, d);
		System.out.println(result);
	}

	public static int solution(int X, int Y, int D) {
		int result = 0;
		if ((Y - X) % D > 0) {
			return (Y - X) / D + 1;
		} else {
			return (Y - X) / D;
		}
	}
}
