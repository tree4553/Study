package baekjoon;
import java.io.*;
import java.util.*;
public class baekjoon_10824 {
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String AB, CD;
		StringTokenizer st = new StringTokenizer(br.readLine());
		AB = st.nextToken() + st.nextToken();
		CD = st.nextToken() + st.nextToken();
		bw.write(String.valueOf(Long.parseLong(AB)+Long.parseLong(CD)));
		bw.flush();
	}
}
