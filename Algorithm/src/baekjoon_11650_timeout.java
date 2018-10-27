import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class baekjoon_11650_timeout {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		int x = 0, y = 0;
		int[][] arr = new int[t][2];
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < t; i++) {
			for (int j = i + 1; j < t; j++) {
				if (arr[i][0] > arr[j][0]) {
					x = arr[j][0];
					y = arr[j][1];
					arr[j][0] = arr[i][0];
					arr[j][1] = arr[i][1];
					arr[i][0] = x;
					arr[i][1] = y;
				}
			}
		}
		for (int i = 0; i < t; i++) {
			for (int j = i + 1; j < t; j++) {
				if (arr[i][0] == arr[j][0]) {
					if (arr[i][1] > arr[j][1]) {
						y = arr[j][1];
						arr[j][1] = arr[i][1];
						arr[i][1] = y;
					}
				}
			}
		}
		for(int i = 0 ; i < t ; i++) {
			sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
			System.out.println(sb);
		}
		/*
		for (int i = 0; i < t; i++) {
			bw.write(String.valueOf(arr[i][0]) + " " + String.valueOf(arr[i][1]) + "\n");
		}
		bw.flush();
		bw.close();
		*/
	}

}
