package SW_ExpertAcademy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class SW_2070 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i < T+1; i++) {
			int a = 0, b = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			if (a > b) {
				bw.write("#" + i + " >\n");
			} else if (a == b) {
				bw.write("#" + i + " =\n");
			} else {
				bw.write("#" + i + " <\n");
			}
		}
		bw.flush();
	}

}
