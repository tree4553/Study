import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Arrays;

public class baekjoon_10815 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n1 = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr1 = new int[n1];
		for (int i = 0; i < n1; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr1);
		int n2 = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] arr2 = new int[n2];
		for (int i = 0; i < n2; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		String answer = "";
		for(int i = 0 ; i < n2 ; i++){
//			answer += solution(arr2[i],arr1);
//			if(i == n2){
//				answer += "\n";
//			}
//			else{
//				answer += " ";
//			}
			System.out.print(solution(arr2[i],arr1) + " ");
		}
//		bw.write(answer);
//		bw.flush();
//		bw.close();
	}
	public static int solution(int n , int[] arr){
		int min = 0;
		int max = arr.length;
		int middle = 0;
		while(max-min>1){
			middle = (min+max)/2;
			if(arr[0] == n){
				return 1;
			}
			if(arr[middle] == n){
				return 1;
			}
			if(arr[middle] > n){
				max = middle;
			}
			else if(arr[middle] < n){
				min = middle;
			}
		}
		return 0;
	}
}
