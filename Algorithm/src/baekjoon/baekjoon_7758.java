package baekjoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.HashSet;

public class baekjoon_7758 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		String[] input = new String[2];
		Set<String> set = new HashSet<>();
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			input[0] = st.nextToken();
			input[1] = st.nextToken();
			if (input[1].equals("enter")) {
				set.add(input[0]);
			} else {
				set.remove(input[0]);
			}
		}
		String[] arr = set.toArray(new String[set.size()]);
		Arrays.sort(arr);
		for (int i = arr.length - 1; i >= 0; i--) {
			bw.write(arr[i] + "\n");
		}
		bw.flush();
		bw.close();
	}

}
