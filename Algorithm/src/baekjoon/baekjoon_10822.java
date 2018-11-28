package baekjoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class baekjoon_10822 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String [] args) throws IOException {
		int result = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(),",");
		while(st.hasMoreTokens()) {
			result += Integer.parseInt(st.nextToken());
		}
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
	}
}
