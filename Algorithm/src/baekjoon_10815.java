import java.util.*;
import java.io.*;

public class baekjoon_10815 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		LinkedList<Integer> list1 = new LinkedList<>();
		int a = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < a ; i++ ) {
			list1.add(Integer.parseInt(st.nextToken()));
		}
		
	}

}
