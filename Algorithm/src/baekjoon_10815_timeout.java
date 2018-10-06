//시간초과로 실패
import java.util.*;
import java.io.*;
public class baekjoon_10815_timeout {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String result = "";
		int a = Integer.parseInt(br.readLine());
		int[] arr1 = new int[a];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < a ; i ++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		int b = Integer.parseInt(br.readLine());
		int[] arr2 = new int[b];
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < b ; i ++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 0 ; i < arr1.length; i++) {
			for(int j = 0 ; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					arr2[j] = 1;
					break;
				}
			}
		}
		for(int i = 0 ; i < arr2.length; i++) {
			if(arr2[i]!=1) {
				arr2[i] = 0;
			}
		}
		for(int i = 0 ; i < arr2.length; i++) {
			if(i < arr2.length-1) {
				result += arr2[i] + " ";
			}else {
				result += arr2[i] + "\n";
			}
		}
		bw.write(result);
		bw.flush();
		bw.close();
	}

}
