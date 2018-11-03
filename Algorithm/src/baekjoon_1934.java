import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class baekjoon_1934 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		int a = 0, b = 0;
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			bw.write(solution(a, b) + "\n");
		}
		bw.flush();
		bw.close();
	}

	// 유클리드 호제법으로 최대공약수를 구한 후 최소공배수를 구한다.
	static int solution(int a, int b) {
		int result = 1;
		int temp = 1;
		int x = 0, y = 0;
		if (a > b) {
			x = a;
			y = b;
		} else if (a < b) {
			x = b;
			y = a;
		} else {
			return a;
		}
		while (x % y > 0) {
			temp = x % y;
			x = y;
			y = temp;
		}
		// 최대공약수
		result = y;
		// 최소공배수
		result = a * b / result;
		return result;
	}
}
