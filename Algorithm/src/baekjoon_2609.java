import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class baekjoon_2609 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int[] result = new int[2];
		result = solution(a,b);
		System.out.println(result[0]);
		System.out.println(result[1]);
		
	}
	// 유클리드 호제법을 이용한 풀이
	static int[] solution(int a, int b) {
		// result[0] = common divisor
		// result[1] = common multiple
		int[] result = {1,0};
		int x, y;
		if(a > b) {
			x = a;
			y = b;
		}else {
			x = b;
			y = a;
		}
		int mod = x%y;
		while(mod > 0) {
			x = y;
			y = mod;
			mod = x%y;
		}
		result[0] = y;
		result[1] = (a/result[0])*b;
		return result;
	}
}
