package baekjoon;
import java.util.*;
import java.io.*;

public class baekjoon_15552 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase = Integer.parseInt(br.readLine());
		int a=0, b=0;

		for (int i = 0; i < testCase; i++) {
			try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			bw.write(a + b + "\n");
			}catch(Exception e) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				b = Integer.parseInt(st.nextToken());
				bw.write(a + b + "\n");
			}
		}
		bw.flush();

	}
}